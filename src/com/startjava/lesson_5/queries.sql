 --выведите всю таблицу
 SELECT * FROM jagers;
 --отобразите только не уничтоженных роботов
 SELECT * FROM jagers WHERE status = 'active';
 --отобразите роботов нескольких серий, например Mark-1 и Mark-6
 SELECT * FROM jagers WHERE mark = '1' OR mark = '6';
-- отображение по нескольким столбцам
 SELECT * FROM jagers WHERE kaijuKill > 1 AND origin = 'USA';
 --отсортируйте таблицу по убыванию по столбцу mark
 SELECT * FROM jagers ORDER BY mark DESC;
 --отобразите самого старого робота
 SELECT MIN(launch) FROM jagers;
 SELECT modelName, launch FROM jagers WHERE launch = (SELECT MIN(launch) FROM jagers);
 --отобразите роботов, которые уничтожили больше/меньше всех kaiju
 SELECT * FROM jagers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jagers);
 SELECT * FROM jagers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jagers);
 --отобразите средний вес роботов
 SELECT AVG(weight) FROM jagers;
 --увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
 UPDATE jagers SET kaijuKill = kaijuKill + 1 WHERE status = 'active';
 SELECT * FROM jagers;
 --удалите уничтоженных роботов
 DELETE FROM jagers WHERE status = 'destroyed';
 SELECT * FROM jagers;