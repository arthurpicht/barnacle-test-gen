package de.arthurpicht.barnacleGeneratorTest.tg_01.tc_07.persistence.vof;

import de.arthurpicht.barnacle.annotations.Annotations;
import de.arthurpicht.barnacle.annotations.Annotations.Barnacle;
import de.arthurpicht.barnacle.annotations.Annotations.PrimaryKey;
import de.arthurpicht.barnacle.annotations.Annotations.Unique;

@Barnacle
public class EntityCustomTypeVOF {

    @Barnacle
    @PrimaryKey
    protected int id;

    @Barnacle
    @Annotations.Type(type = "VARCHAR", para1 = "5")
    protected String code;

}
