# Currency Converter

Un conversor de monedas desarrollado en Java que utiliza el API de [ExchangeRate-API](https://www.exchangerate-api.com) para obtener tasas de cambio en tiempo real.

## Características

- Conversión de monedas seleccionables entre USD, ARS, BOB, BRL, CLP y COP.
- Interfaz de usuario interactiva basada en consola.
- Implementación modular utilizando Java y Gson para manejar datos JSON.

## Requisitos

- **Java 17** o superior.
- Biblioteca **Gson** (incluida en la carpeta `lib/` si no se usa un gestor de dependencias como Gradle).
- Clave de API válida de ExchangeRate-API.

## Instalación

1. **Clona este repositorio en tu máquina local**:
   ```bash
   git clone https://github.com/Joelsr-dev/currency-converter.git
   cd currency-converter
   
2. **Configura tu clave de API**:

Abre CurrencyClient.java y reemplaza YOUR_API_KEY con tu clave de ExchangeRate-API:
   ```bash
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD";
```
3. **Compila y ejecuta el proyecto**:

Si estás utilizando javac y la biblioteca Gson en formato .jar, ejecuta:

```bash
javac -cp lib/gson.jar src/main/java/com/currencyconverter/*.java -d out
java -cp lib/gson.jar:out com.currencyconverter.Main
```
Si usas Gradle, ejecuta:
```bash
    gradle run
```
# Uso

Al iniciar el programa, verás un menú en la consola que te permitirá seleccionar las monedas de origen y destino, además de ingresar la cantidad que deseas convertir. El programa calculará el valor convertido y lo mostrará en pantalla.

**Ejemplo de interacción**:
```bash
Conversor de Monedas
1. Realizar una conversión
2. Salir
   Seleccione una opción: 1

Seleccione la moneda de origen:
1. USD
2. ARS
3. BOB
4. BRL
5. CLP
6. COP
   Ingrese la opción: 1

Seleccione la moneda de destino:
1. USD
2. ARS
3. BOB
4. BRL
5. CLP
6. COP
   Ingrese la opción: 5

Ingrese la cantidad en USD: 100
El valor convertido de USD a COP es: 410000.00
```



