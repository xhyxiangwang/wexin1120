package com.tencent.mm.plugin.card.b;

import com.tencent.gmtrace.GMTrace;

public enum q
{
  public int scene;
  
  static
  {
    GMTrace.i(18905506512896L, 140857);
    kAX = new q("EN_DYNAMIC_CODE_SCENE_ENTER_FOREGROUND", 0, 1);
    kAY = new q("EN_DYNAMIC_CODE_SCENE_ENTER_WXCARD", 1, 2);
    kAZ = new q("EN_DYNAMIC_CODE_SCENE_ENTER_CARD_DETAIL", 2, 3);
    kBa = new q[] { kAX, kAY, kAZ };
    GMTrace.o(18905506512896L, 140857);
  }
  
  private q(int paramInt)
  {
    GMTrace.i(18905372295168L, 140856);
    this.scene = paramInt;
    GMTrace.o(18905372295168L, 140856);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */