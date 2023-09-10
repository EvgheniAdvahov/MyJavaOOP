# ReadmeMD

Создал 5 package

1. App
    - Тут Main
2. Controller
    - Тут находиться Контролер
3. Data
    - Format - в классе ENUM перечислил форматы
    - PhoneBook - класс родитель
    - WhatsUpPhoneBook - дочерний класс PhoneBook
4. Service
    - InterfaceServicePhoneBook - интерфейс
    - ServicePhoneBook - класс в котором реализованны методы из интерфейса
5. View
    - InterfacePhoneBook - интерфейс
    - ViewPhoneBook - класс в котором реализованны методы из интерфейса

### Реализация

1. В классе ***Main*** вызываем метод ***startController***
2. В методе ***startController*** 
    - вызываем методы ***Import** или **Export*** из ***package Service***
    - вызываем метод ***viewPhoneBook*** из package ***View***

