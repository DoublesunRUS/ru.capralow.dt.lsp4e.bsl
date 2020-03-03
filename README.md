# dt.lsp4e.bsl [![Build Status](https://travis-ci.com/DoublesunRUS/ru.capralow.dt.lsp4e.bsl.svg)](https://travis-ci.com/DoublesunRUS/ru.capralow.dt.lsp4e.bsl) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.lsp4e.bsl&metric=alert_status)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.lsp4e.bsl) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.lsp4e.bsl&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.lsp4e.bsl) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.lsp4e.bsl&metric=coverage)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.lsp4e.bsl)


## LSP4E для BSL LS для [1C:Enterprise Development Tools](http://v8.1c.ru/overview/IDE/) 2020.1

Минимальная версия EDT: 2020.1

Текущий релиз в ветке [master: 0.1.0](https://github.com/DoublesunRUS/ru.capralow.dt.lsp4e.bsl/tree/master).<br>
Разработка ведется в ветке [dev](https://github.com/DoublesunRUS/ru.capralow.dt.lsp4e.bsl/tree/dev).<br>

В данном репозитории хранятся только исходники.<br>

Плагин можно установить в EDT через пункт "Установить новое ПО" указав сайт обновления http://capralow.ru/edt/lsp4e.bsl/latest/ .<br>
Для самостоятельной сборки плагина необходимо иметь доступ к сайту https://releases.1c.ru и настроить соответствующим образом Maven. Подробности настройки написаны [здесь](https://github.com/1C-Company/dt-example-plugins/blob/master/simple-plugin/README.md).<br>

### BSL Language Server
Плагин использует [BSL Language Server](https://github.com/1c-syntax/bsl-language-server) в соответствии с [лицензией](https://github.com/1c-syntax/bsl-language-server/blob/develop/COPYING.md).<br>
В состав плагина включена версия 0.13.0<br>
Список диагностик можно посмотреть на [официальном сайте](https://1c-syntax.github.io/bsl-language-server/diagnostics) сервера.

### Возможности
Плагин подключает BSL Language Server к LSP4E и обеспечивает работу BSL LS через Language Server Protocol.<br>
Ядро EDT при этом __не__ используется.<br>
Для просмотра ошибок необходимо использовать панель Общие -> Неполадки.<br>
