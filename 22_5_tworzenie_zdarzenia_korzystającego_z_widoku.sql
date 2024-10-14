CREATE TABLE STATS
(
    STAT_ID   INT(11) AUTO_INCREMENT PRIMARY KEY,
    STAT_DATE DATETIME    NOT NULL,
    STAT      VARCHAR(20) NOT NULL,
    VALUE     INT(11)     NOT NULL
);

CREATE VIEW BESTSELLERS_COUNT AS
SELECT COUNT(*) AS BESTSELLERS_COUNT
FROM BOOKS BK
WHERE BK.BESTSELLER = TRUE;

SELECT * FROM BESTSELLERS_COUNT;

USE KODILLA_COURSE;

CREATE EVENT UPDATE_BESTSELLERS
    ON SCHEDULE EVERY 1 MINUTE
    DO
BEGIN
CALL UpdateBooks();
INSERT INTO STATS(VALUE, STAT_DATE, STAT)
VALUES (
           (SELECT BESTSELLERS_COUNT FROM BESTSELLERS_COUNT),
           now(),
           'BESTSELLERS');
END;

SHOW PROCESSLIST;

UPDATE BOOKS SET BESTSELLER = TRUE;

SELECT * FROM BOOKS;

SELECT * FROM BESTSELLERS_COUNT;

SELECT * FROM STATS;