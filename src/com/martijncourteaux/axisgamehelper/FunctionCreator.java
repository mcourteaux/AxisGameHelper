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
public class FunctionCreator
{
    public static String generateFunction(List<Vector2d> points, List<Vector2d> rages)
    {
        String strPath = PathFunctionCreator.generateBasePath(points);
        String strRages = RageFunctionCreator.generateRageFunction(rages);
        
        if (strRages.isEmpty())
        {
            return strPath;
        }
        return strPath + " " + strRages;
    }
}
