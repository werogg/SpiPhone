package es.jotero.spiphone.phone;

import es.jotero.spiphone.phone.gui.IPhoneInterface;
import org.bukkit.entity.Player;

public class Phone implements IPhone {
    private String phoneName;
    private final Player phoneOwner;
    private final IPhoneInterface phoneInterface;

    private Phone(PhoneBuilder builder) {
        this.phoneName = builder.phoneName;
        this.phoneOwner = builder.phoneOwner;
        this.phoneInterface = builder.phoneInterface;
    }


    public IPhoneInterface getInterface() {
        return null;
    }

    public void setInterface(IPhoneInterface phoneInterface) {

    }

    // Builder Class
    public static class PhoneBuilder {

        private String phoneName;
        private Player phoneOwner;
        private IPhoneInterface phoneInterface;

        public PhoneBuilder setPhoneName(String phoneName) {
            this.phoneName = phoneName;
            return this;
        }

        public PhoneBuilder setPhoneOwner(Player phoneOwner) {
            this.phoneOwner = phoneOwner;
            return this;
        }

        public PhoneBuilder setPhoneInterface(IPhoneInterface phoneInterface) {
            this.phoneInterface = phoneInterface;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

    }
}
