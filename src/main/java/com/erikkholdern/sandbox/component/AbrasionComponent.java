package com.erikkholdern.sandbox.component;

import org.ladysnake.cca.api.v3.component.Component;

public interface AbrasionComponent extends Component {
    double getLastX();
    void setLastX(double lastX);
    double getLastZ();
    void setLastZ(double lastZ);
}
