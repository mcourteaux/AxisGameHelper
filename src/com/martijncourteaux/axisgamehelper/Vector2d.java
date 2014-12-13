/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martijncourteaux.axisgamehelper;

/**
 *
 * @author martijncourteaux
 */
public class Vector2d
{
    public double x, y;

    public Vector2d(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Vector2d(Vector2d v)
    {
        this.x = v.x;
        this.y = v.y;
    }

    public Vector2d()
    {
    }
    
    public void sub(Vector2d v)
    {
        x -= v.x;
        y -= v.y;
    }
    
    
    
}
