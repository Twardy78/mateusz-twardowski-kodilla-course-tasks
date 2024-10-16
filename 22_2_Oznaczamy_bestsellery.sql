DROP PROCEDURE IF EXISTS UpdateBooks;

DELIMITER $$

CREATE PROCEDURE UpdateBooks()
BEGIN
    DECLARE BOOKSRENTED, B_ID INT;
    DECLARE FINISHED INT DEFAULT 0;
    DECLARE ALL_BOOKS CURSOR FOR SELECT BOOK_ID FROM BOOKS;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET FINISHED = 1;
OPEN ALL_BOOKS;
WHILE (FINISHED = 0) DO
    FETCH ALL_BOOKS INTO B_ID;
    IF (FINISHED = 0) THEN
SELECT COUNT(*) FROM RENTS
WHERE BOOK_ID = B_ID
    INTO BOOKSRENTED;

UPDATE BOOKS SET BESTSELLER = UpdateBestseller(BOOKSRENTED)
WHERE BOOK_ID = B_ID;
COMMIT;
END IF;
END WHILE;
CLOSE ALL_BOOKS;
END $$

DELIMITER ;

CALL UpdateBooks();

DROP FUNCTION IF EXISTS UpdateBestseller;

DELIMITER $$

CREATE FUNCTION UpdateBestseller(rentedBooks INT) RETURNS BOOLEAN DETERMINISTIC
BEGIN
    DECLARE result BOOLEAN DEFAULT false;
    IF rentedBooks > 2 THEN
        SET result = true;
END IF;
RETURN result;
END $$

DELIMITER ;