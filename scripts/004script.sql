ALTER TABLE `DISHES_INGREDIENTS`
  DROP FOREIGN KEY `DISH_INGR_DISH_FK`;

ALTER TABLE `DISHES_INGREDIENTS` 
 ADD CONSTRAINT `DISH_INGR_DISH_FK` FOREIGN KEY (`DISH_ID`) REFERENCES `DISH` (`ID`) ON DELETE CASCADE;