package GitHubBasic;

public class GitHubTheory {
    public static void main(String[] args) {
        System.out.println("I'm learning basic information about git and github");

        /*
                                  00  ОПРЕДЕЛЕНИЕ

        Систем контроля версия/Version Control System (VCS) - это технология, которая позволяет
        хранить код в интернет-хранилище и определять доступ к этому хранилищу для других людей.

        Есть две системы контроля версий (самых популярных): SubVersion (SVN) и Git. Git более
        новая, удобная и разширенная по сравнению с SVN технолгия. Поэтому имеет смысл разбирать
        только Git.


        Git - это технология передачи, хранения и получения кода с помощюь интернет-ресурсов.

        Git - распределенная система управления версиями.



        GitHub - это кластер компьютеров в интернете, которые содержит в себе технологию Git
        и одновременно является хранилищем кода, которым хотят поделиться.

        GitHub - это крупнейший веб-сервис для хостинга IT-проектов и их совместной рахработки.
        Хостинг - хранилище (хранение).

        Repository (репозиторий) - это хранилище, в котором содержится отдельный проект.
        Репозитории могут быть публичными - доступны всем и приватными - с ограниченным доступом.


                                01 РЕГИСТРАЦИЯ НА GITHAB

                                02 СОЗДАНИЕ УДАЛЕННОГО РЕПОЗИТОРИЯ
            (локальный - папки проекта на своем компьютере, а удаленный - на веб ресурсе)

            В верхнем правом углу нажимаем + -> new repository -> write name -> Create repository

                                03 ИНТЕГРИРУЕМ ТЕХНОЛОГИЮ Git с IntellijIdea

     А) Скачиваем Гит: google - git download - Windows - (указать путь сохранения) - Save

     Б) Устанавливаем Гит: All Default

     В) Указываем путь исполняемоего файла технологии гит: File - Settings - Version Control - Git
        В поле Path to Git executable пишем свой путь, например: C:\Program Files\Git\bin\git.exe
        (which git - 'which' is not recognized ad an internal or external command)

     Г) Нажимаем Test для подтверждения успешной интеграции

     Д) Указываем в идее свой логин и пароль для ГитХаба:
         File - Settings - Version Control - GitHub - Set login and password - OK


                                04 ЗАГРУЗКА ПРОЕКТА НА ГИТХАБ



                            Github workflow - пошаговое действие (алгоритм)
                 который нужно выполнить, чтобы залить проект на гитхаб или скачать с гитхаба

 Working Directory <-ADD!> Staging (index) <COMMIT -> Local Repository <PUSH!-> Remote Repository

            А) Присоеденяем проект в идее к Гиту: VCS - Import into Version Control -
               - Create Git Repository - choose my project - OK
               Теперь проект "Under Git" - под контролем Гита.
               Working Directory - это и есть директория (папка) проекта под контролем гита.
               Файлы андергит стали красного цвета

            Б) Добавляем те файлы из нашего проекта (from  Working Directory), которые хотим залить
               на Гитхаб. Такая операция называется Add. Для этого:

               В браузере папок (в Идее) выбираем нужную папку (файл) - Git - Add
               Выбранные для переноса файлы стали зеленого цвета

            В) Подтверждаем свой выбор файлов для переноса с добавлением описания. Такая операция
               называется Commit. Для этого: VCS - commit - check/uncheck files - write commit
               message - Commit.
                  (Если нужно удалить из work directory ненужный файл, то выбираем ПКМ - Revert)

            











         */


    }
}
