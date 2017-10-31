package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.game.c.bb;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public final class c
  extends f
{
  public int fCC;
  public int fKV;
  public String fuy;
  public String jpi;
  public String myX;
  public String myY;
  public String myZ;
  public String mza;
  public String mzb;
  public boolean mzc;
  public String mzd;
  public String mze;
  public String mzf;
  public LinkedList<String> mzg;
  public String mzh;
  public LinkedList<String> mzi;
  public boolean mzj;
  public boolean mzk;
  public String mzl;
  public String mzm;
  public String mzn;
  public String mzo;
  public String mzp;
  public boolean mzq;
  public String mzr;
  public long mzs;
  public int mzt;
  public bb mzu;
  public String name;
  public int position;
  public int scene;
  public int status;
  public int type;
  public int versionCode;
  
  public c()
  {
    GMTrace.i(12610963505152L, 93959);
    this.status = 0;
    this.type = 0;
    this.myX = "";
    this.myY = "";
    this.myZ = "#929292";
    this.mza = "";
    this.mzb = "";
    this.fuy = "";
    this.mzc = false;
    this.scene = 0;
    this.fKV = 0;
    this.position = 1;
    this.versionCode = 0;
    this.mzd = "";
    this.mze = "";
    this.mzf = "";
    this.mzg = new LinkedList();
    this.mzh = "";
    this.mzi = new LinkedList();
    this.mzj = false;
    this.mzk = false;
    this.mzl = "";
    this.mzm = "#fca28a";
    this.mzn = "";
    this.jpi = "";
    this.name = "";
    this.mzo = "#222222";
    this.mzp = "";
    this.mzq = false;
    this.mzr = "";
    this.mzs = 0L;
    this.fCC = 0;
    this.mzt = 0;
    GMTrace.o(12610963505152L, 93959);
  }
  
  public final boolean aEa()
  {
    GMTrace.i(15198412865536L, 113237);
    if (((this.mzt == 1) || (this.mzt == 2)) && (this.mzu != null) && (!bg.mZ(this.mzu.mFv)))
    {
      GMTrace.o(15198412865536L, 113237);
      return true;
    }
    GMTrace.o(15198412865536L, 113237);
    return false;
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */