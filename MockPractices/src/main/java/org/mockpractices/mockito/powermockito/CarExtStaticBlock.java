/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mockpractices.mockito.powermockito;

/**
 *
 * @author amk-ec-017
 */
public class CarExtStaticBlock extends VehicleStaticBlock {
    
    private Engine engine;
    
    public CarExtStaticBlock(Engine engine) {
        this.engine = engine;
    }
    
    public boolean start() {
        if(engine.start() == Engine.STARTED) {
            return true;
        }
        return false;
    }
}
