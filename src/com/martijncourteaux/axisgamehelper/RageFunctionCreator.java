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
public class RageFunctionCreator
{
    public static String generateRageFunction(List<Vector2d> posAmp)
    {
        if (posAmp.isEmpty()) return "";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < posAmp.size(); ++i)
        {
            Vector2d target = posAmp.get(i);
            sb.append(String.format("+%.1f*exp(-4(x-%.1f)^2)*sin(20x)", target.y, target.x));
        }
        return sb.substring(1);
    }
}
