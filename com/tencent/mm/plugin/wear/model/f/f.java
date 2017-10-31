package com.tencent.mm.plugin.wear.model.f;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.wear.model.a;
import com.tencent.mm.plugin.wear.model.e.r;
import com.tencent.mm.plugin.wear.model.g;
import com.tencent.mm.plugin.wear.model.h;
import com.tencent.mm.protocal.c.bpy;
import com.tencent.mm.protocal.c.bpz;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;
import java.util.LinkedList;

public final class f
  extends c
{
  private String fvS;
  private int type;
  private String username;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9188679876608L, 68461);
    this.username = paramString1;
    this.fvS = paramString2;
    this.type = paramInt;
    GMTrace.o(9188679876608L, 68461);
  }
  
  public final String getName()
  {
    GMTrace.i(9188948312064L, 68463);
    GMTrace.o(9188948312064L, 68463);
    return "WearFriendCreateTask";
  }
  
  protected final void send()
  {
    GMTrace.i(9188814094336L, 68462);
    Object localObject = a.bzo().shj.Ka(this.username);
    bpz localbpz = new bpz();
    if (this.type == 1)
    {
      bpy localbpy = new bpy();
      localbpy.mGz = ((com.tencent.mm.plugin.wear.model.f)localObject).id;
      localbpy.jWW = this.username;
      localbpy.jYc = this.fvS;
      localbpy.ovi = ab.getContext().getString(R.l.esE);
      localObject = com.tencent.mm.ab.b.a(this.username, false, -1);
      if (localObject != null) {
        localbpy.uFD = new com.tencent.mm.bl.b(h.L((Bitmap)localObject));
      }
      localbpz.jWR.add(localbpy);
    }
    try
    {
      a.bzo();
      r.a(20006, localbpz.toByteArray(), true);
      GMTrace.o(9188814094336L, 68462);
      return;
    }
    catch (IOException localIOException)
    {
      GMTrace.o(9188814094336L, 68462);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */