package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.bi.d;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.bz.a;
import com.tencent.mm.g.a.bz.b;
import com.tencent.mm.g.a.cd;
import com.tencent.mm.g.a.cd.a;
import com.tencent.mm.g.a.cd.b;
import com.tencent.mm.g.a.fr;
import com.tencent.mm.g.a.lv;
import com.tencent.mm.g.a.lv.b;
import com.tencent.mm.g.a.pv;
import com.tencent.mm.g.a.pv.b;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;

public class FavUrlTask
  extends GWMainProcessTask
{
  public static final Parcelable.Creator<FavUrlTask> CREATOR;
  public int actionType;
  public boolean ftR;
  public Bundle lRQ;
  public boolean mvK;
  public boolean mvL;
  public int ret;
  public int type;
  
  static
  {
    GMTrace.i(17075582009344L, 127223);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17075582009344L, 127223);
  }
  
  public FavUrlTask()
  {
    GMTrace.i(17075313573888L, 127221);
    GMTrace.o(17075313573888L, 127221);
  }
  
  public FavUrlTask(Parcel paramParcel)
  {
    GMTrace.i(17075447791616L, 127222);
    f(paramParcel);
    GMTrace.o(17075447791616L, 127222);
  }
  
  public final void RS()
  {
    GMTrace.i(17074910920704L, 127218);
    switch (this.actionType)
    {
    }
    for (;;)
    {
      GMTrace.o(17074910920704L, 127218);
      return;
      Object localObject2;
      int i;
      Object localObject3;
      boolean bool;
      if (this.lRQ != null)
      {
        long l = this.lRQ.getLong("msg_id", Long.MIN_VALUE);
        localObject2 = this.lRQ.getString("sns_local_id");
        i = this.lRQ.getInt("news_svr_id", 0);
        localObject3 = this.lRQ.getString("news_svr_tweetid");
        localObject1 = new cd();
        if (Long.MIN_VALUE == l) {
          break label367;
        }
        ((cd)localObject1).fwt.fwx = this.lRQ.getInt("message_index", 0);
        bool = e.a((cd)localObject1, l);
        if (!bool) {
          break label530;
        }
        Object localObject4 = bg.mY(this.lRQ.getString("prePublishId"));
        localObject2 = q.gi((String)localObject4);
        localObject3 = q.Aw().n((String)localObject2, true);
        ((q.b)localObject3).k("sendAppMsgScene", Integer.valueOf(2));
        ((q.b)localObject3).k("preChatName", this.lRQ.getString("preChatName"));
        ((q.b)localObject3).k("preMsgIndex", Integer.valueOf(this.lRQ.getInt("preMsgIndex")));
        ((q.b)localObject3).k("prePublishId", localObject4);
        ((q.b)localObject3).k("preUsername", this.lRQ.getString("preUsername"));
        ((q.b)localObject3).k("getA8KeyScene", this.lRQ.getString("getA8KeyScene"));
        ((q.b)localObject3).k("referUrl", this.lRQ.getString("referUrl"));
        localObject4 = this.lRQ.getBundle("jsapiargs");
        if (localObject4 != null) {
          ((q.b)localObject3).k("adExtStr", ((Bundle)localObject4).getString("key_snsad_statextstr"));
        }
        ((cd)localObject1).fwt.fwy = ((String)localObject2);
        a.uLm.m((b)localObject1);
      }
      for (;;)
      {
        this.ret = ((cd)localObject1).fwu.ret;
        GMTrace.o(17074910920704L, 127218);
        return;
        label367:
        if (!bg.mZ((String)localObject2))
        {
          localObject3 = new pv();
          ((pv)localObject3).fNF.fNI = ((String)localObject2);
          ((pv)localObject3).fNF.fNJ = ((cd)localObject1);
          ((pv)localObject3).fNF.url = this.lRQ.getString("rawUrl");
          a.uLm.m((b)localObject3);
          bool = ((pv)localObject3).fNG.fwc;
          break;
        }
        if (i != 0)
        {
          localObject2 = new lv();
          ((lv)localObject2).fJR.opType = 3;
          ((lv)localObject2).fJR.fJT = ((cd)localObject1);
          ((lv)localObject2).fJR.fJU = i;
          ((lv)localObject2).fJR.fJV = ((String)localObject3);
          a.uLm.m((b)localObject2);
          bool = ((lv)localObject2).fJS.fwc;
          break;
        }
        this.mvK = true;
        GMTrace.o(17074910920704L, 127218);
        return;
        label530:
        if (((cd)localObject1).fwt.fwz == 0) {
          ((cd)localObject1).fwt.fwz = R.l.dWJ;
        }
        a.uLm.m((b)localObject1);
      }
      Object localObject1 = new fr();
      ((fr)localObject1).fBn.type = 35;
      a.uLm.m((b)localObject1);
      GMTrace.o(17074910920704L, 127218);
      return;
      this.mvL = d.KT("favorite");
      GMTrace.o(17074910920704L, 127218);
      return;
      localObject1 = new bz();
      ((bz)localObject1).fwo.fwq = this.lRQ.getLong("fav_local_id", -1L);
      a.uLm.m((b)localObject1);
      w.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", new Object[] { Long.valueOf(((bz)localObject1).fwo.fwq), Boolean.valueOf(((bz)localObject1).fwp.fwc) });
      this.ftR = ((bz)localObject1).fwp.fwc;
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool2 = true;
    GMTrace.i(17075045138432L, 127219);
    this.actionType = paramParcel.readInt();
    this.lRQ = paramParcel.readBundle();
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.mvK = bool1;
      if (paramParcel.readByte() != 1) {
        break label103;
      }
      bool1 = true;
      label52:
      this.ftR = bool1;
      this.ret = paramParcel.readInt();
      this.type = paramParcel.readInt();
      if (paramParcel.readByte() != 1) {
        break label108;
      }
    }
    label103:
    label108:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.mvL = bool1;
      GMTrace.o(17075045138432L, 127219);
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label52;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(17075179356160L, 127220);
    paramParcel.writeInt(this.actionType);
    paramParcel.writeBundle(this.lRQ);
    if (this.mvK)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.ftR) {
        break label103;
      }
      paramInt = 1;
      label51:
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.ret);
      paramParcel.writeInt(this.type);
      if (!this.mvL) {
        break label108;
      }
    }
    label103:
    label108:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(17075179356160L, 127220);
      return;
      paramInt = 0;
      break;
      paramInt = 0;
      break label51;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/model/FavUrlTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */