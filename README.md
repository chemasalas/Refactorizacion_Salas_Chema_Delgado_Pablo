## Qué se ha mejorado
Renombrado semántico
Se sustituyeron nombres por otros mas claros y descriptivos usando herramientas del IDE:

m → importeBase

tC → tipoCliente

dV → esSocioVip

cT → calcularTotal

Esto  hace que se entienda mejor la variable.

## Eliminación de números mágicos
Los valores de descuento estaban escritos directamente en el código.
Se extrajeron como constantes:

private static final double DESCUENTO_VIP_EXTRA = 0.25;
private static final double DESCUENTO_VIP = 0.15;
private static final double DESCUENTO_ESTANDAR = 0.05;

Esto mejora la claridad y permite cambiar los valores fácilmente.

## Simplificación con cláusulas de guarda
El método original tenía varios niveles de if anidados.
Se reescribió para evitar complejidad innecesaria:

Si el importe es ≤ 0 → se devuelve 0

Si el cliente es VIP → se calcula su descuento

Si es estándar → se aplica su descuento

Si no tiene categoría → se devuelve el importe original

El flujo ahora es vertical y fácil de seguir.
