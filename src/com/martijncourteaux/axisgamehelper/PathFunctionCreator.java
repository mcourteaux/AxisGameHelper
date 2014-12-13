/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martijncourteaux.axisgamehelper;

import java.util.List;

/**
 *
 * @author martijncourteaux
 */
public class PathFunctionCreator
{
    
    public static String generateBasePath(List<Vector2d> points)
    {
        if (points.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        double lastHeight = 0;
        for (int i = 0; i < points.size(); ++i)
        {
            Vector2d target = points.get(i);
            double yDiff = target.y - lastHeight;
            sb.append(String.format("+%.2f*exp(1-exp(-9(x-%.2f)))", yDiff/Math.E, target.x));
            lastHeight += Math.round(yDiff * 100.0) * 0.01; 
        }
        return sb.substring(1);
    }
    
}
