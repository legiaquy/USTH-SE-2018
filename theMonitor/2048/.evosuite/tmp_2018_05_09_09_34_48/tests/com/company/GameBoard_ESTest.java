/*
 * This file was automatically generated by EvoSuite
 * Wed May 09 03:38:05 GMT 2018
 */

package com.company;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.company.GameBoard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GameBoard_ESTest extends GameBoard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GameBoard gameBoard0 = new GameBoard(781, 781);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Random.setNextRandom(15329769);
      GameBoard gameBoard0 = new GameBoard(15329769, 15329769);
  }
}