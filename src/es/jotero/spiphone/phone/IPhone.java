package es.jotero.spiphone.phone;

import es.jotero.spiphone.phone.gui.IPhoneInterface;

public interface IPhone {

    IPhoneInterface getInterface();
    void setInterface(IPhoneInterface phoneInterface);

}
