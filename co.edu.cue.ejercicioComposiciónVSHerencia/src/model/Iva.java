package model;

import Interface.IvaStandard;

public class Iva implements IvaStandard {

    @Override
    public double getImporteConIva(double importe) {
        return importe*1.21;
    }
}
