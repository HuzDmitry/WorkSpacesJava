package org.exa.DZ.DZOOP_3;

import java.util.Comparator;
import java.util.Iterator;

public class ContainerCountComparator implements Comparator<Container> {
    @Override
    public int compare(Container o1, Container o2) {
        return o1.getSizeBox() - o2.getSizeBox();
    }
}
