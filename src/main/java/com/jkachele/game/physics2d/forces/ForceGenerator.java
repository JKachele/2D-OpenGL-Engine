/******************************************
 *Project-------Engine2D-LWJGL
 *File----------ForceGenerator.java
 *Author--------Justin Kachele
 *Date----------10/17/2022
 *License-------GNU GENERAL PUBLIC LICENSE
 ******************************************/
package com.jkachele.game.physics2d.forces;

import com.jkachele.game.physics2d.rigidbody.Rigidbody2D;

public interface ForceGenerator {
    void updateForce(Rigidbody2D rigidbody, float dt);
}
