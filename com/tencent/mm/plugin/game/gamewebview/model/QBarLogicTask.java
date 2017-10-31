package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.al;
import com.tencent.mm.g.a.mc;
import com.tencent.mm.g.a.me;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public class QBarLogicTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<QBarLogicTask> CREATOR;
  private static c gNt;
  public static Map<String, Integer> mvY;
  public String fFg;
  public int type;
  
  static
  {
    GMTrace.i(17078132146176L, 127242);
    gNt = new c() {};
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17078132146176L, 127242);
  }
  
  public QBarLogicTask()
  {
    GMTrace.i(17077863710720L, 127240);
    GMTrace.o(17077863710720L, 127240);
  }
  
  public QBarLogicTask(Parcel paramParcel)
  {
    GMTrace.i(17077997928448L, 127241);
    f(paramParcel);
    GMTrace.o(17077997928448L, 127241);
  }
  
  public final void RS()
  {
    GMTrace.i(17077326839808L, 127236);
    switch (this.type)
    {
    }
    for (;;)
    {
      GMTrace.o(17077326839808L, 127236);
      return;
      String str = this.fFg;
      if (mvY == null)
      {
        mvY = new HashMap();
        a.uLm.b(gNt);
      }
      Object localObject = new mc();
      ((mc)localObject).fKl.filePath = str;
      a.uLm.m((b)localObject);
      mvY.put(str, Integer.valueOf(1));
      GMTrace.o(17077326839808L, 127236);
      return;
      str = this.fFg;
      if ((mvY == null) || (!mvY.containsKey(str)))
      {
        w.e("MicroMsg.QBarLogicTask", "%s is not recognizing", new Object[] { str });
        GMTrace.o(17077326839808L, 127236);
        return;
      }
      localObject = new al();
      ((al)localObject).fuF.filePath = str;
      a.uLm.m((b)localObject);
      mvY.remove(str);
    }
  }
  
  public final void VB()
  {
    GMTrace.i(17077461057536L, 127237);
    GMTrace.o(17077461057536L, 127237);
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(17077595275264L, 127238);
    this.type = paramParcel.readInt();
    this.fFg = paramParcel.readString();
    GMTrace.o(17077595275264L, 127238);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17077729492992L, 127239);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.fFg);
    GMTrace.o(17077729492992L, 127239);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/QBarLogicTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */