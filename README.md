## Qué se ha mejorado
Renombrado semántico
Se sustituyeron nombres por otros mas claros y descriptivos usando herramientas del IDE:

m → importeBase

tC → tipoCliente

dV → esSocioVip

cT → calcularTotal

Esto  hace que se entienda mejor la variable.

<img width="683" height="217" alt="image" src="https://github.com/user-attachments/assets/607b05b5-bd0d-4072-a197-d30bcab03e6b" />

No podemos hacerlo a lo bruto tenemos que darle click derecho y rename. Y cambiamos asi el nombre de todas las variables. Esta es la erramienta que nos da el IDE


## Eliminación de números mágicos
Los valores de descuento estaban escritos directamente en el código

Se extrajeron como constantes:

private static final double DESCUENTO_VIP_EXTRA = 0.25;

private static final double DESCUENTO_VIP = 0.15;

private static final double DESCUENTO_ESTANDAR = 0.05;

Esto mejora la claridad y permite cambiar los valores fácilmente.

## Simplificación 
El método original tenía varios niveles de if.
Se reescribió para evitar complejidad innecesaria:

Si el importe es ≤ 0 → se devuelve 0




Si el cliente es VIP → se calcula su descuento

Si es estándar → se aplica su descuento

Si no tiene categoría → se devuelve el importe original

El flujo ahora es vertical y fácil de seguir.
