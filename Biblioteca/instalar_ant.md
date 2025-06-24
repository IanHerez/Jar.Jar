# Instalación de Apache Ant en Windows

## Opción 1: Usando Chocolatey (recomendado)

1. Instala Chocolatey desde https://chocolatey.org/
2. Abre PowerShell como administrador
3. Ejecuta: `choco install ant`

## Opción 2: Instalación manual

1. Descarga Ant desde https://ant.apache.org/bindownload.cgi
2. Extrae el archivo en C:\apache-ant
3. Agrega C:\apache-ant\bin al PATH del sistema
4. Reinicia la terminal

## Verificar instalación

```bash
ant -version
```

## Usar Ant en el proyecto

```bash
ant compile    # Compilar
ant run        # Ejecutar
```
