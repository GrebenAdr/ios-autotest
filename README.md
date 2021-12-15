UI автотесты.

Для прогона тестов выполнить:
1) mvn -P all-tests clean install
2) Запустить тесты в классе ui.tests.IOSTest через нажатие по классу правой кнопкой мыши и выбрав Run 'IOSTests'

Для локальной сборки отчета в терминале выполните команду:
mvn -P all-tests allure:serve