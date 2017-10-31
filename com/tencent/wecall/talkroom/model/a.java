package com.tencent.wecall.talkroom.model;

import com.tencent.pb.common.c.c;

public class a
{
  private static a xLE = null;
  private f xLF = null;
  
  public static a cnM()
  {
    if (xLE == null) {}
    try
    {
      if (xLE == null) {
        xLE = new a();
      }
      return xLE;
    }
    finally {}
  }
  
  public static f cnN()
  {
    a locala = cnM();
    if (locala.xLF == null) {}
    try
    {
      if (locala.xLF == null) {
        locala.xLF = new f();
      }
      return locala.xLF;
    }
    finally {}
  }
  
  public static void cnO()
  {
    c.d("MicroMsg.Voip", new Object[] { "registerEvents" });
    cnN();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/wecall/talkroom/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */