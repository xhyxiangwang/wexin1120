package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.k.b;
import com.tencent.mm.plugin.emoji.b.c;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class CommonActivityTask
  extends GameProcessActivityTask
{
  public static final Parcelable.Creator<CommonActivityTask> CREATOR;
  public Bundle lRQ;
  public int type;
  
  static
  {
    GMTrace.i(16952504352768L, 126306);
    CREATOR = new Parcelable.Creator() {};
    GMTrace.o(16952504352768L, 126306);
  }
  
  public CommonActivityTask(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(16952235917312L, 126304);
    this.lRQ = new Bundle();
    GMTrace.o(16952235917312L, 126304);
  }
  
  public CommonActivityTask(Parcel paramParcel)
  {
    GMTrace.i(16952370135040L, 126305);
    this.lRQ = new Bundle();
    f(paramParcel);
    GMTrace.o(16952370135040L, 126305);
  }
  
  public final void VB()
  {
    GMTrace.i(16951833264128L, 126301);
    GMTrace.o(16951833264128L, 126301);
  }
  
  public final void a(Context paramContext, final GameProcessActivityTask.a parama)
  {
    GMTrace.i(16951699046400L, 126300);
    Object localObject1;
    int i;
    int j;
    Object localObject3;
    switch (this.type)
    {
    default: 
      GMTrace.o(16951699046400L, 126300);
      return;
    case 1: 
      localObject1 = this.lRQ.getString("result");
      if (!bg.mZ((String)localObject1))
      {
        localObject2 = this.lRQ.getString("url");
        i = this.lRQ.getInt("codeType");
        j = this.lRQ.getInt("codeVersion");
        localObject3 = new Intent();
        ((Intent)localObject3).setClass(paramContext, WebviewScanImageActivity.class);
        ((Intent)localObject3).setFlags(603979776);
        ((Intent)localObject3).putExtra("key_string_for_scan", (String)localObject1);
        ((Intent)localObject3).putExtra("key_string_for_url", (String)localObject2);
        ((Intent)localObject3).putExtra("key_codetype_for_scan", i);
        ((Intent)localObject3).putExtra("key_codeversion_for_scan", j);
        paramContext.startActivity((Intent)localObject3);
        parama.WJ();
      }
      GMTrace.o(16951699046400L, 126300);
      return;
    }
    Object localObject2 = this.lRQ.getString("img_path");
    if (o.QO((String)localObject2))
    {
      localObject1 = g.bg((String)localObject2);
      localObject1 = ((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vr((String)localObject1);
      if ((localObject1 != null) && (((EmojiInfo)localObject1).bRU())) {
        break label609;
      }
      localObject1 = ((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vs((String)localObject2);
      localObject1 = ((c)com.tencent.mm.kernel.h.j(c.class)).getEmojiMgr().vr((String)localObject1);
    }
    label294:
    label299:
    label446:
    label603:
    label609:
    for (;;)
    {
      if (localObject1 == null)
      {
        i = 0;
        if (localObject1 != null) {
          break label446;
        }
        localObject3 = new BitmapFactory.Options();
        ((BitmapFactory.Options)localObject3).inJustDecodeBounds = true;
        if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject2, (BitmapFactory.Options)localObject3) == null) || (((BitmapFactory.Options)localObject3).outHeight <= b.uf())) && (((BitmapFactory.Options)localObject3).outWidth <= b.uf())) {
          break label603;
        }
      }
      for (j = 1;; j = 0)
      {
        if ((i > b.ug()) || (j != 0))
        {
          com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dRc), "", paramContext.getString(R.l.egp), null);
          com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(R.l.dRc), "", paramContext.getString(R.l.egp), "", false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16941901152256L, 126227);
              parama.WJ();
              GMTrace.o(16941901152256L, 126227);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(16953578094592L, 126314);
              parama.WJ();
              GMTrace.o(16953578094592L, 126314);
            }
          });
          GMTrace.o(16951699046400L, 126300);
          return;
          i = e.aY(((EmojiInfo)localObject1).bSb());
          break label294;
          localObject2 = ((EmojiInfo)localObject1).bSb();
          break label299;
        }
        localObject2 = new Intent();
        if (localObject1 != null) {}
        for (localObject1 = ((EmojiInfo)localObject1).GP();; localObject1 = "")
        {
          ((Intent)localObject2).putExtra("Retr_File_Name", (String)localObject1);
          ((Intent)localObject2).putExtra("Retr_Msg_Type", 5);
          ((Intent)localObject2).putExtra("Retr_MsgImgScene", 1);
          a.ifM.l((Intent)localObject2, paramContext);
          parama.WJ();
          GMTrace.o(16951699046400L, 126300);
          return;
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("Retr_File_Name", (String)localObject2);
        ((Intent)localObject1).putExtra("Retr_Compress_Type", 0);
        ((Intent)localObject1).putExtra("Retr_Msg_Type", 0);
        ((Intent)localObject1).addFlags(268435456);
        a.ifM.l((Intent)localObject1, paramContext);
        parama.WJ();
        break;
      }
    }
  }
  
  public final void f(Parcel paramParcel)
  {
    GMTrace.i(16951967481856L, 126302);
    this.type = paramParcel.readInt();
    this.lRQ = paramParcel.readBundle(getClass().getClassLoader());
    GMTrace.o(16951967481856L, 126302);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    GMTrace.i(16952101699584L, 126303);
    paramParcel.writeInt(this.type);
    paramParcel.writeBundle(this.lRQ);
    GMTrace.o(16952101699584L, 126303);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/CommonActivityTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */