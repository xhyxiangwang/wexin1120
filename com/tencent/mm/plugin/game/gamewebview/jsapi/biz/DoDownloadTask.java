package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.f;
import com.tencent.mm.plugin.downloader.model.g;
import com.tencent.mm.plugin.downloader.model.g.a;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.pluginsdk.model.app.q;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public class DoDownloadTask
  extends GWMainProcessTask
{
  public static Parcelable.Creator<DoDownloadTask> CREATOR;
  public String appId;
  public String extInfo;
  public long fti;
  public String fwU;
  public boolean fwc;
  public String mul;
  public String mum;
  public String mun;
  public long muo;
  public String packageName;
  public int scene;
  public int type;
  public String url;
  
  static
  {
    GMTrace.i(17054107172864L, 127063);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(17054107172864L, 127063);
  }
  
  public DoDownloadTask()
  {
    GMTrace.i(17053301866496L, 127057);
    GMTrace.o(17053301866496L, 127057);
  }
  
  public DoDownloadTask(Parcel paramParcel)
  {
    GMTrace.i(17053972955136L, 127062);
    f(paramParcel);
    GMTrace.o(17053972955136L, 127062);
  }
  
  public final void RS()
  {
    boolean bool1 = false;
    boolean bool2 = true;
    GMTrace.i(17053436084224L, 127058);
    w.i("MicroMsg.AddDownloadTask", "doDownloadTask, type = " + this.type);
    Object localObject;
    switch (this.type)
    {
    default: 
      GMTrace.o(17053436084224L, 127058);
      return;
    case 1: 
      w.i("MicroMsg.AddDownloadTask", "addDownloadTask");
      localObject = new gl();
      ((gl)localObject).fCE.url = this.url;
      ((gl)localObject).fCE.fwU = this.fwU;
      ((gl)localObject).fCE.extInfo = this.extInfo;
      ((gl)localObject).fCE.appId = this.appId;
      ((gl)localObject).fCE.scene = this.scene;
      com.tencent.mm.sdk.b.a.uLm.m((b)localObject);
      localObject = new g.a();
      ((g.a)localObject).va(this.url);
      ((g.a)localObject).vb(this.mum);
      ((g.a)localObject).bn(this.muo);
      ((g.a)localObject).vc(this.mul);
      ((g.a)localObject).vd(this.fwU);
      ((g.a)localObject).setAppId(this.appId);
      ((g.a)localObject).bz(this.packageName);
      ((g.a)localObject).dK(true);
      ((g.a)localObject).mh(bg.getInt(this.mun, 1));
      ((g.a)localObject).li(this.scene);
      localObject = ((g.a)localObject).kTs;
      this.fti = f.aoQ().a((g)localObject);
      GMTrace.o(17053436084224L, 127058);
      return;
    case 2: 
      w.i("MicroMsg.AddDownloadTask", "pauseDownloadTask");
      bool1 = f.aoQ().be(this.fti);
    }
    for (;;)
    {
      this.fwc = bool1;
      break;
      w.i("MicroMsg.AddDownloadTask", "resumeDownloadTask");
      localObject = com.tencent.mm.plugin.downloader.model.e.bj(this.fti);
      if (localObject != null)
      {
        ((com.tencent.mm.plugin.downloader.e.a)localObject).field_scene = this.scene;
        com.tencent.mm.plugin.downloader.model.e.c((com.tencent.mm.plugin.downloader.e.a)localObject);
      }
      bool1 = f.aoQ().bf(this.fti);
      continue;
      w.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      if (f.aoQ().bc(this.fti) > 0) {}
      for (bool1 = bool2;; bool1 = false)
      {
        this.fwc = bool1;
        GMTrace.o(17053436084224L, 127058);
        return;
      }
      w.i("MicroMsg.AddDownloadTask", "cancelDownloadTask");
      localObject = f.aoQ().bd(this.fti);
      if (((FileDownloadTaskInfo)localObject).status == -1)
      {
        w.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, apilevel not supported");
      }
      else if (((FileDownloadTaskInfo)localObject).status != 3)
      {
        w.e("MicroMsg.AddDownloadTask", "installDownloadTask fail, invalid status = " + ((FileDownloadTaskInfo)localObject).status);
      }
      else if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path))
      {
        localObject = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
        bool1 = q.e(ab.getContext(), (Uri)localObject);
      }
    }
  }
  
  public int describeContents()
  {
    GMTrace.i(17053570301952L, 127059);
    GMTrace.o(17053570301952L, 127059);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool = true;
    GMTrace.i(17053838737408L, 127061);
    this.type = paramParcel.readInt();
    this.mul = paramParcel.readString();
    this.url = paramParcel.readString();
    this.mum = paramParcel.readString();
    this.fwU = paramParcel.readString();
    this.extInfo = paramParcel.readString();
    this.mun = paramParcel.readString();
    this.appId = paramParcel.readString();
    this.packageName = paramParcel.readString();
    this.muo = paramParcel.readLong();
    this.scene = paramParcel.readInt();
    this.fti = paramParcel.readLong();
    if (paramParcel.readByte() == 1) {}
    for (;;)
    {
      this.fwc = bool;
      GMTrace.o(17053838737408L, 127061);
      return;
      bool = false;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(17053704519680L, 127060);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.mul);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.mum);
    paramParcel.writeString(this.fwU);
    paramParcel.writeString(this.extInfo);
    paramParcel.writeString(this.mun);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.packageName);
    paramParcel.writeLong(this.muo);
    paramParcel.writeInt(this.scene);
    paramParcel.writeLong(this.fti);
    if (this.fwc) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      GMTrace.o(17053704519680L, 127060);
      return;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/DoDownloadTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */