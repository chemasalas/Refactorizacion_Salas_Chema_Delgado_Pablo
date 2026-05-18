/**
 * Calcula el importe final aplicando descuentos según el tipo de cliente.
 *
 * @param importeBase Importe original antes del descuento.
 * @param tipoCliente Código de categoría del cliente (1 = VIP, 2 = Estándar, 3 = Sin categoría).
 * @param esSocioVip Indica si el cliente VIP tiene descuento adicional.
 * @return Importe final tras aplicar el descuento correspondiente o 0 si el importe es negativo o nulo.
 */
public class FacturacionLegacy {

    private static final double DESCUENTO_VIP_EXTRA = 0.25;
    private static final double DESCUENTO_VIP = 0.15;
    private static final double DESCUENTO_ESTANDAR = 0.05;

    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {

        if (importeBase <= 0) return 0;

        if (tipoCliente == 1)
            return importeBase - (importeBase * (esSocioVip ? DESCUENTO_VIP_EXTRA : DESCUENTO_VIP));

        if (tipoCliente == 2)
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);

        return importeBase;
    }
}
