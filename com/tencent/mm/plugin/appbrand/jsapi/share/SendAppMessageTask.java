package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.b.a;
import com.tencent.mm.ac.b.c;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.u;
import com.tencent.mm.ac.u.a;
import com.tencent.mm.compatible.util.p;
import com.tencent.mm.g.a.ob;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bsh;
import com.tencent.mm.protocal.c.bsi;
import com.tencent.mm.protocal.c.bsr;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.w.c;
import com.tencent.mm.w.f.a;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.q;
import com.tencent.mm.x.q.b;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class SendAppMessageTask
  extends MainProcessTask
{
  public static final Parcelable.Creator<SendAppMessageTask> CREATOR;
  String appId;
  String description;
  int fBH;
  String fty;
  String fvS;
  String iJX;
  String iMh;
  Runnable iQi;
  String iconUrl;
  String jbk;
  String jbl;
  String jbm;
  int jbn;
  String jbo;
  String jbp;
  String jbq;
  boolean jbr;
  String jbs;
  ArrayList<ShareInfo> jbt;
  String path;
  int scene;
  String title;
  String toUser;
  int type;
  String url;
  String userName;
  int version;
  boolean withShareTicket;
  
  static
  {
    GMTrace.i(18236565356544L, 135873);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(18236565356544L, 135873);
  }
  
  public SendAppMessageTask()
  {
    GMTrace.i(18235491614720L, 135865);
    this.scene = 1000;
    GMTrace.o(18235491614720L, 135865);
  }
  
  protected SendAppMessageTask(Parcel paramParcel)
  {
    GMTrace.i(18236431138816L, 135872);
    this.scene = 1000;
    f(paramParcel);
    GMTrace.o(18236431138816L, 135872);
  }
  
  public final void RS()
  {
    GMTrace.i(18235625832448L, 135866);
    w.i("MicroMsg.SendAppMessageTask", "username = %s, thumbIconUrl = %s", new Object[] { this.userName, this.jbl });
    final Object localObject2 = new byte[0];
    final Object localObject1 = null;
    final Object localObject3;
    if ((!bg.mZ(this.jbl)) && ((this.jbl.startsWith("http://")) || (this.jbl.startsWith("https://"))))
    {
      localObject1 = com.tencent.mm.modelappbrand.a.b.CT().hh(this.jbl);
      if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
        break label785;
      }
      w.i("MicroMsg.SendAppMessageTask", "thumb image is not null ");
      localObject2 = Bitmap.createBitmap(((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight(), Bitmap.Config.ARGB_8888);
      localObject3 = new Canvas((Bitmap)localObject2);
      ((Canvas)localObject3).drawColor(-1);
      ((Canvas)localObject3).drawBitmap((Bitmap)localObject1, 0.0F, 0.0F, null);
      localObject1 = new ByteArrayOutputStream();
      ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject1);
      localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
      ((Bitmap)localObject2).recycle();
    }
    for (;;)
    {
      w.i("MicroMsg.SendAppMessageTask", "doSendMessage, appId : %s, title = %s, description = %s ,username = %s ,path = %s, thumbIconUrl = %s", new Object[] { this.appId, this.title, this.description, this.userName, this.path, this.jbl });
      localObject2 = q.gi("wxapp_" + this.appId + this.path);
      q.Aw().n((String)localObject2, true).k("prePublishId", "wxapp_" + this.appId + this.path);
      localObject2 = new f.a();
      ((f.a)localObject2).title = this.title;
      ((f.a)localObject2).description = this.description;
      ((f.a)localObject2).type = 33;
      ((f.a)localObject2).hdl = this.userName;
      ((f.a)localObject2).hdk = this.path;
      ((f.a)localObject2).hdm = this.appId;
      ((f.a)localObject2).hds = this.fBH;
      ((f.a)localObject2).hdt = this.version;
      ((f.a)localObject2).hdo = this.iJX;
      ((f.a)localObject2).hdn = this.type;
      ((f.a)localObject2).url = this.url;
      ((f.a)localObject2).hdu = this.iconUrl;
      ((f.a)localObject2).fMh = ("wxapp_" + this.appId + this.path);
      ((f.a)localObject2).fMb = this.userName;
      ((f.a)localObject2).fMc = this.fvS;
      localObject3 = new com.tencent.mm.w.a();
      ((com.tencent.mm.w.a)localObject3).haH = this.jbr;
      ((com.tencent.mm.w.a)localObject3).haI = this.iMh;
      ((f.a)localObject2).a((c)localObject3);
      localObject3 = new StringBuilder("1_");
      ((StringBuilder)localObject3).append(this.appId);
      ((StringBuilder)localObject3).append("_");
      h.xx();
      ((StringBuilder)localObject3).append(com.tencent.mm.a.o.getString(com.tencent.mm.kernel.a.wy()));
      ((StringBuilder)localObject3).append("_");
      ((StringBuilder)localObject3).append(bg.Po());
      ((StringBuilder)localObject3).append("_");
      ((StringBuilder)localObject3).append(this.jbn);
      ((f.a)localObject2).hdq = ((StringBuilder)localObject3).toString();
      if (!this.withShareTicket) {
        break label799;
      }
      final int i = this.scene;
      localObject4 = new b.a();
      ((b.a)localObject4).hlW = 1118;
      ((b.a)localObject4).uri = "/cgi-bin/mmbiz-bin/wxaapp/getshareinfo";
      bsh localbsh = new bsh();
      localbsh.fKY = this.appId;
      final LinkedList localLinkedList = new LinkedList(bg.f(this.toUser.split(",")));
      localbsh.uHb = localLinkedList;
      ((b.a)localObject4).hlX = localbsh;
      ((b.a)localObject4).hlY = new bsi();
      u.a(((b.a)localObject4).DA(), new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ac.b paramAnonymousb, k paramAnonymousk)
        {
          GMTrace.i(18235088961536L, 135862);
          w.i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousString = (bsi)paramAnonymousb.hlV.hmc;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && (paramAnonymousString != null) && (paramAnonymousString.uHc != null))
          {
            paramAnonymousb = paramAnonymousString.uHc;
            SendAppMessageTask.this.jbt = new ArrayList();
            paramAnonymousInt1 = 0;
            if (paramAnonymousInt1 < localLinkedList.size())
            {
              if (paramAnonymousInt1 < paramAnonymousb.size()) {}
              for (paramAnonymousString = (bsr)paramAnonymousb.get(paramAnonymousInt1);; paramAnonymousString = new bsr())
              {
                localObject2.hdr = paramAnonymousString.uHA;
                SendAppMessageTask.this.jbt.add(new ShareInfo(paramAnonymousString.uHA, paramAnonymousString.uHz));
                SendAppMessageTask.this.a(localObject2, localObject1, (String)localLinkedList.get(paramAnonymousInt1), localObject3, i);
                paramAnonymousInt1 += 1;
                break;
              }
            }
          }
          else
          {
            if (localObject2.hdn == 3) {
              localObject2.hdn = 2;
            }
            paramAnonymousString = localLinkedList.iterator();
            while (paramAnonymousString.hasNext())
            {
              paramAnonymousb = (String)paramAnonymousString.next();
              SendAppMessageTask.this.a(localObject2, localObject1, paramAnonymousb, localObject3, i);
            }
          }
          SendAppMessageTask.this.VC();
          GMTrace.o(18235088961536L, 135862);
          return 0;
        }
      });
      GMTrace.o(18235625832448L, 135866);
      return;
      if (bg.mZ(this.jbm)) {
        break;
      }
      localObject1 = d.QK(this.jbm);
      boolean bool = com.tencent.mm.loader.stub.b.deleteFile(this.jbm);
      w.v("MicroMsg.SendAppMessageTask", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", new Object[] { this.jbm, Boolean.valueOf(bool) });
      break;
      label785:
      w.e("MicroMsg.SendAppMessageTask", "thumb image is null");
      localObject1 = localObject2;
    }
    label799:
    Object localObject4 = new LinkedList(bg.f(this.toUser.split(","))).iterator();
    while (((Iterator)localObject4).hasNext()) {
      a((f.a)localObject2, (byte[])localObject1, (String)((Iterator)localObject4).next(), (StringBuilder)localObject3, this.scene);
    }
    GMTrace.o(18235625832448L, 135866);
  }
  
  public final void VB()
  {
    GMTrace.i(18235760050176L, 135867);
    if (this.iQi != null) {
      this.iQi.run();
    }
    GMTrace.o(18235760050176L, 135867);
  }
  
  public final void a(f.a parama, byte[] paramArrayOfByte, String paramString, StringBuilder paramStringBuilder, int paramInt)
  {
    GMTrace.i(18235894267904L, 135868);
    ((com.tencent.mm.plugin.appbrand.compat.a.a)h.h(com.tencent.mm.plugin.appbrand.compat.a.a.class)).a(parama, this.appId, this.title, paramString, paramArrayOfByte);
    if (!bg.mZ(this.jbk))
    {
      parama = new ob();
      parama.fMk.fMl = paramString;
      parama.fMk.content = this.jbk;
      parama.fMk.type = com.tencent.mm.x.o.fY(paramString);
      parama.fMk.flags = 0;
      com.tencent.mm.sdk.b.a.uLm.m(parama);
    }
    int i = 1;
    if (paramString.toLowerCase().endsWith("@chatroom"))
    {
      parama = ((com.tencent.mm.plugin.chatroom.b.a)h.h(com.tencent.mm.plugin.chatroom.b.a.class)).yU().gq(paramString);
      if (parama == null) {
        break label228;
      }
    }
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    String str9;
    String str1;
    label228:
    for (i = parama.size();; i = 0)
    {
      str2 = this.appId;
      str3 = this.fty;
      str4 = this.jbo;
      str5 = this.title;
      str6 = this.path;
      str7 = this.jbp;
      str8 = this.jbq;
      str9 = paramStringBuilder.toString();
      str1 = this.jbs;
      if (!bg.mZ(str2)) {
        break;
      }
      w.e("MicroMsg.SendAppMessageTask", "appId is Null!");
      GMTrace.o(18235894267904L, 135868);
      return;
    }
    parama = "";
    try
    {
      paramArrayOfByte = p.encode(bg.mY(str6), "UTF-8");
      parama = paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode share page path error!");
      }
    }
    paramArrayOfByte = "";
    try
    {
      paramStringBuilder = p.encode(bg.mY(str7), "UTF-8");
      paramArrayOfByte = paramStringBuilder;
    }
    catch (UnsupportedEncodingException paramStringBuilder)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode current page path error!");
      }
    }
    paramStringBuilder = "";
    try
    {
      str1 = p.encode(bg.mY(str1), "UTF-8");
      paramStringBuilder = str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.e("MicroMsg.SendAppMessageTask", "encode current html url error!");
      }
    }
    w.d("MicroMsg.SendAppMessageTask", "stev report(%s), appId %s, scene %s, sceneNote %s, sessionId %s, currentPath %s, currentTitle %s,shareTitle %s, sharePath %s, shareActionId %s, destinationUserCount %s, destinationUserName %s", new Object[] { Integer.valueOf(14077), str2, Integer.valueOf(paramInt), str3, str4, str7, str8, str5, str6, str9, Integer.valueOf(i), paramString });
    g.paX.i(14077, new Object[] { str2, Integer.valueOf(paramInt), str3, str4, paramArrayOfByte, str8, str5, parama, str9, "", Integer.valueOf(i), paramString, paramStringBuilder });
    GMTrace.o(18235894267904L, 135868);
  }
  
  public int describeContents()
  {
    GMTrace.i(18236162703360L, 135870);
    GMTrace.o(18236162703360L, 135870);
    return 0;
  }
  
  public final void f(Parcel paramParcel)
  {
    boolean bool2 = true;
    GMTrace.i(18236028485632L, 135869);
    this.appId = paramParcel.readString();
    this.userName = paramParcel.readString();
    this.title = paramParcel.readString();
    this.description = paramParcel.readString();
    this.jbk = paramParcel.readString();
    this.toUser = paramParcel.readString();
    this.url = paramParcel.readString();
    this.path = paramParcel.readString();
    this.type = paramParcel.readInt();
    this.jbl = paramParcel.readString();
    this.iconUrl = paramParcel.readString();
    this.jbm = paramParcel.readString();
    this.fBH = paramParcel.readInt();
    this.iJX = paramParcel.readString();
    this.version = paramParcel.readInt();
    this.fvS = paramParcel.readString();
    this.jbn = paramParcel.readInt();
    this.scene = paramParcel.readInt();
    this.fty = paramParcel.readString();
    this.jbo = paramParcel.readString();
    this.jbp = paramParcel.readString();
    this.jbq = paramParcel.readString();
    if (paramParcel.readByte() == 1)
    {
      bool1 = true;
      this.withShareTicket = bool1;
      if (paramParcel.readInt() != 1) {
        break label261;
      }
    }
    label261:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.jbr = bool1;
      this.iMh = paramParcel.readString();
      this.jbs = paramParcel.readString();
      this.jbt = paramParcel.readArrayList(SendAppMessageTask.class.getClassLoader());
      GMTrace.o(18236028485632L, 135869);
      return;
      bool1 = false;
      break;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = 1;
    GMTrace.i(18236296921088L, 135871);
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.appId);
    paramParcel.writeString(this.userName);
    paramParcel.writeString(this.title);
    paramParcel.writeString(this.description);
    paramParcel.writeString(this.jbk);
    paramParcel.writeString(this.toUser);
    paramParcel.writeString(this.url);
    paramParcel.writeString(this.path);
    paramParcel.writeInt(this.type);
    paramParcel.writeString(this.jbl);
    paramParcel.writeString(this.iconUrl);
    paramParcel.writeString(this.jbm);
    paramParcel.writeInt(this.fBH);
    paramParcel.writeString(this.iJX);
    paramParcel.writeInt(this.version);
    paramParcel.writeString(this.fvS);
    paramParcel.writeInt(this.jbn);
    paramParcel.writeInt(this.scene);
    paramParcel.writeString(this.fty);
    paramParcel.writeString(this.jbo);
    paramParcel.writeString(this.jbp);
    paramParcel.writeString(this.jbq);
    if (this.withShareTicket)
    {
      paramInt = 1;
      paramParcel.writeByte((byte)paramInt);
      if (!this.jbr) {
        break label261;
      }
    }
    label261:
    for (paramInt = i;; paramInt = 0)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeString(this.iMh);
      paramParcel.writeString(this.jbs);
      paramParcel.writeList(this.jbt);
      GMTrace.o(18236296921088L, 135871);
      return;
      paramInt = 0;
      break;
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/SendAppMessageTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */