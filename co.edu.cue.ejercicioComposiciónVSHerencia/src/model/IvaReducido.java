package model;

import Interface.IvaStandard;

public class IvaReducido implements IvaStandard {

    @Override
    public double getImporteConIva(double importe) {
        return importe;
    }

}
