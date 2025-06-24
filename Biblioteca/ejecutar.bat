@echo off
echo Compilando el proyecto Biblioteca...
javac -d bin src/biblioteca/*.java
if %errorlevel% equ 0 (
    echo Compilacion exitosa!
    echo.
    echo Ejecutando el programa...
    echo.
    java -cp bin biblioteca.Biblioteca
) else (
    echo Error en la compilacion!
)
pause 