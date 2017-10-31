package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;

public enum c
{
  public int action;
  
  static
  {
    GMTrace.i(18906177601536L, 140862);
    kAC = new c("CARDCODEREFRESHACTION_UNSHOWN_TIMEOUT", 0, 0);
    kAD = new c("CARDCODEREFRESHACTION_SHOWING_TIMEOUT", 1, 1);
    kAE = new c("CARDCODEREFRESHACTION_SNAPSHOT", 2, 2);
    kAF = new c("CARDCODEREFRESHACTION_DOREFRESH", 3, 3);
    kAG = new c("CARDCODEREFRESHACTION_ENTERFOREGROUND", 4, 4);
    kAH = new c("CARDCODEREFRESHACTION_BANCODE", 5, 5);
    kAI = new c("CARDCODEREFRESHACTION_UPDATECHANGE", 6, 6);
    kAJ = new c("CARDCODEREFRESHACTION_ENTERCHANGE", 7, 7);
    kAK = new c[] { kAC, kAD, kAE, kAF, kAG, kAH, kAI, kAJ };
    GMTrace.o(18906177601536L, 140862);
  }
  
  private c(int paramInt)
  {
    GMTrace.i(18906043383808L, 140861);
    this.action = 0;
    this.action = paramInt;
    GMTrace.o(18906043383808L, 140861);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */