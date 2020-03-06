# Задание 5. Наследование и проектирование кода

Код текущего приложения необходимо структурировать. Выделить вспомогательные и утилитные классы (сквозной функционал, который используется во всех заданиях), оформить разные пункты меню как соответствующие классы, выделить общий функционал в родительский класс. Оставить в классах приложения только тот код, который соответствует их функциональности и назначению.

## Базовые требования

1. Отделить методы для работы с вводом-выводом в отдельный класс
2. Определить собственные классы исключений с текстом ошибок
3. Создать иерархию классов для пунктов меню
4. Вспомогательные и утилитные классы не должны ссылаться и использовать другие классы приложения

## Доп. требования

5. В классах, отвечающих за пункты меню, не должно быть кода связанного с чтением данных, должны передаваться типизированные значения/переменные
6. В классах, отвечающих за чтение данных, не должно быть кода связанного с расчётами или логикой заложенной в соответствующий пункт меню

## Приёмка

1. Проверить предыдущий реализованный функционал, он должен работать.
2. Проверить, что выделен класс для ввода-вывода данных.
3. Проверить, что выделен базовый класс MenuItemBase и в класс вынесен номер меню и строки.
4. Проверить, что код каждого пункта меню вынесен в отдельный класс наследник от MenuItemBase.
5. Проверить, что в коде есть и используются классы исключения для валидации вводимых значений.

## Примечания

Название базового класса для пункта меню (MenuItemBase) не принципиально и может быть выбрано студентом на своё усмотрение.