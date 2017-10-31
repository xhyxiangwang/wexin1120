package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.k.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.contact.u;
import com.tencent.mm.ui.tools.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.x.aa;
import com.tencent.mm.x.ap;
import com.tencent.mm.x.c;
import com.tencent.mm.x.i;
import com.tencent.mm.x.j;
import com.tencent.mm.x.m;
import com.tencent.mm.x.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SeeRoomMemberUI
  extends MMActivity
  implements com.tencent.mm.ac.e
{
  private static int kGp;
  private String fAJ;
  private boolean fFn;
  private com.tencent.mm.ui.base.q iXW;
  private boolean kCM;
  private com.tencent.mm.storage.q kDf;
  private String kEG;
  private int kEH;
  private String kEI;
  private boolean kEJ;
  private String kEr;
  private GridView kGb;
  private b kGi;
  private String kGj;
  private String kGk;
  private p kGl;
  private String kGm;
  private MMEditText kGn;
  private int kGo;
  private String mTitle;
  private String username;
  private int vv;
  
  static
  {
    GMTrace.i(9166936604672L, 68299);
    kGp = 5;
    GMTrace.o(9166936604672L, 68299);
  }
  
  public SeeRoomMemberUI()
  {
    GMTrace.i(9161299460096L, 68257);
    GMTrace.o(9161299460096L, 68257);
  }
  
  /* Error */
  private static Object a(Object paramObject, String paramString, Object[] paramArrayOfObject, Class[] paramArrayOfClass)
  {
    // Byte code:
    //   0: ldc2_w 123
    //   3: ldc 125
    //   5: invokestatic 87	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   8: aload_0
    //   9: ifnonnull +13 -> 22
    //   12: ldc2_w 123
    //   15: ldc 125
    //   17: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   20: aconst_null
    //   21: areturn
    //   22: aload_0
    //   23: invokevirtual 131	java/lang/Object:getClass	()Ljava/lang/Class;
    //   26: astore 4
    //   28: aload 4
    //   30: ldc 127
    //   32: if_acmpeq +138 -> 170
    //   35: aload 4
    //   37: aload_1
    //   38: aload_3
    //   39: invokevirtual 137	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   42: astore 5
    //   44: aload 5
    //   46: astore_1
    //   47: aload_1
    //   48: ifnull +117 -> 165
    //   51: aload_1
    //   52: iconst_1
    //   53: invokevirtual 143	java/lang/reflect/Method:setAccessible	(Z)V
    //   56: aload_1
    //   57: aload_0
    //   58: aload_2
    //   59: invokevirtual 147	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   62: astore_0
    //   63: ldc2_w 123
    //   66: ldc 125
    //   68: invokestatic 92	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   71: aload_0
    //   72: areturn
    //   73: astore 5
    //   75: ldc -107
    //   77: aload 5
    //   79: ldc -105
    //   81: iconst_0
    //   82: anewarray 127	java/lang/Object
    //   85: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   88: aload 4
    //   90: invokevirtual 160	java/lang/Class:getSuperclass	()Ljava/lang/Class;
    //   93: astore 4
    //   95: goto -67 -> 28
    //   98: astore 5
    //   100: ldc -107
    //   102: aload 5
    //   104: ldc -105
    //   106: iconst_0
    //   107: anewarray 127	java/lang/Object
    //   110: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   113: goto -25 -> 88
    //   116: astore_0
    //   117: ldc -107
    //   119: aload_0
    //   120: ldc -105
    //   122: iconst_0
    //   123: anewarray 127	java/lang/Object
    //   126: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   129: aconst_null
    //   130: astore_0
    //   131: goto -68 -> 63
    //   134: astore_0
    //   135: ldc -107
    //   137: aload_0
    //   138: ldc -105
    //   140: iconst_0
    //   141: anewarray 127	java/lang/Object
    //   144: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   147: aconst_null
    //   148: astore_0
    //   149: goto -86 -> 63
    //   152: astore_0
    //   153: ldc -107
    //   155: aload_0
    //   156: ldc -105
    //   158: iconst_0
    //   159: anewarray 127	java/lang/Object
    //   162: invokestatic 157	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   165: aconst_null
    //   166: astore_0
    //   167: goto -104 -> 63
    //   170: aconst_null
    //   171: astore_1
    //   172: goto -125 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	paramObject	Object
    //   0	175	1	paramString	String
    //   0	175	2	paramArrayOfObject	Object[]
    //   0	175	3	paramArrayOfClass	Class[]
    //   26	68	4	localClass	Class
    //   42	3	5	localMethod	java.lang.reflect.Method
    //   73	5	5	localNoSuchMethodException	NoSuchMethodException
    //   98	5	5	localSecurityException	SecurityException
    // Exception table:
    //   from	to	target	type
    //   35	44	73	java/lang/NoSuchMethodException
    //   35	44	98	java/lang/SecurityException
    //   56	63	116	java/lang/IllegalAccessException
    //   56	63	134	java/lang/IllegalArgumentException
    //   56	63	152	java/lang/reflect/InvocationTargetException
  }
  
  protected static String a(com.tencent.mm.storage.q paramq, String paramString)
  {
    GMTrace.i(9163849596928L, 68276);
    if (paramq == null)
    {
      GMTrace.o(9163849596928L, 68276);
      return "";
    }
    paramq = paramq.fc(paramString);
    GMTrace.o(9163849596928L, 68276);
    return paramq;
  }
  
  private void a(int paramInt, final com.tencent.mm.plugin.chatroom.d.d paramd)
  {
    GMTrace.i(9163178508288L, 68271);
    int j = 0;
    Object localObject3 = "";
    Object localObject4 = "";
    String str = ab.getContext().getString(R.l.dHz);
    final Object localObject1 = paramd.kCy;
    final Object localObject2 = paramd.kCA;
    final Object localObject5 = paramd.fGC;
    if ((paramInt == 63524) && (((localObject1 != null) && (!((List)localObject1).isEmpty())) || ((localObject2 != null) && (!((List)localObject2).isEmpty()))))
    {
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dth), null, getString(R.l.egK), getString(R.l.duP), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(final DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9158346670080L, 68235);
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramd.chatroomName, localObject5);
          paramAnonymousDialogInterface = new ArrayList();
          paramAnonymousDialogInterface.addAll(localObject1);
          paramAnonymousDialogInterface.addAll(localObject2);
          paramAnonymousDialogInterface = new com.tencent.mm.plugin.chatroom.d.k(SeeRoomMemberUI.k(SeeRoomMemberUI.this), paramAnonymousDialogInterface);
          ap.wT().a(paramAnonymousDialogInterface, 0);
          SeeRoomMemberUI localSeeRoomMemberUI1 = SeeRoomMemberUI.this;
          SeeRoomMemberUI localSeeRoomMemberUI2 = SeeRoomMemberUI.this;
          SeeRoomMemberUI.this.getString(R.l.dxm);
          SeeRoomMemberUI.a(localSeeRoomMemberUI1, com.tencent.mm.ui.base.h.a(localSeeRoomMemberUI2, SeeRoomMemberUI.this.getString(R.l.eBn), true, new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(9103585837056L, 67827);
              ap.wT().c(paramAnonymousDialogInterface);
              GMTrace.o(9103585837056L, 67827);
            }
          }));
          GMTrace.o(9158346670080L, 68235);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9077681815552L, 67634);
          GMTrace.o(9077681815552L, 67634);
        }
      });
      GMTrace.o(9163178508288L, 68271);
      return;
    }
    ap.AS();
    com.tencent.mm.storage.q localq = c.yU().gn(this.kEr);
    localObject2 = localObject4;
    localObject1 = localObject3;
    int i = j;
    if (paramInt == -116)
    {
      localObject2 = localObject4;
      localObject1 = localObject3;
      i = j;
      if (amJ())
      {
        localObject2 = localObject4;
        localObject1 = localObject3;
        i = j;
        if (!bg.mZ(localq.field_roomowner))
        {
          localObject1 = getString(R.l.eBt);
          localObject2 = getString(R.l.eBs);
          i = 1;
        }
      }
    }
    if (paramInt == -23)
    {
      localObject1 = getString(R.l.eBz);
      localObject2 = getString(R.l.eBy);
    }
    if (paramInt == -109)
    {
      localObject1 = getString(R.l.eBv);
      localObject2 = getString(R.l.eBu);
    }
    if (paramInt == -122)
    {
      localObject3 = getString(R.l.eBz);
      paramInt = R.l.eBx;
      localObject1 = null;
      ap.AS();
      localObject4 = c.yL().SL(this.kDf.field_roomowner);
      localObject2 = localObject1;
      if (localObject4 != null)
      {
        localObject2 = localObject1;
        if ((int)((com.tencent.mm.l.a)localObject4).gLS > 0) {
          localObject2 = ((af)localObject4).field_conRemark;
        }
      }
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2))
      {
        localObject1 = this.kDf.field_roomowner;
        if (this.kDf != null) {
          break label597;
        }
      }
    }
    label597:
    for (localObject1 = null;; localObject1 = this.kDf.fc((String)localObject1))
    {
      localObject2 = localObject1;
      if (bg.mZ((String)localObject1))
      {
        localObject2 = localObject1;
        if (localObject4 != null)
        {
          localObject2 = localObject1;
          if ((int)((com.tencent.mm.l.a)localObject4).gLS > 0) {
            localObject2 = ((x)localObject4).vp();
          }
        }
      }
      localObject1 = localObject2;
      if (bg.mZ((String)localObject2)) {
        localObject1 = this.kDf.field_roomowner;
      }
      localObject2 = getString(paramInt, new Object[] { localObject1, Integer.valueOf(localq.bPz()) });
      localObject1 = localObject3;
      localObject3 = paramd.kCz;
      if ((localObject5 == null) || (((List)localObject5).size() <= 0) || ((((List)localObject5).size() != paramd.fFD) && ((localObject3 == null) || (((List)localObject3).size() <= 0) || (paramd.fFD != ((List)localObject5).size() + ((List)localObject3).size())))) {
        break label795;
      }
      localObject4 = new LinkedList();
      paramInt = 0;
      while (paramInt < ((List)localObject5).size())
      {
        ((LinkedList)localObject4).add(((List)localObject5).get(paramInt));
        paramInt += 1;
      }
    }
    localObject2 = "";
    localObject5 = ab.getContext().getString(R.l.dHz);
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (!((List)localObject3).isEmpty()) {
        localObject1 = getString(R.l.dZL, new Object[] { bg.c(af((List)localObject3), (String)localObject5) }) + "\n";
      }
    }
    localObject2 = localObject1;
    if (!((List)localObject4).isEmpty()) {
      localObject2 = (String)localObject1 + getString(R.l.dZM, new Object[] { bg.c(af((List)localObject4), (String)localObject5) });
    }
    com.tencent.mm.ui.base.h.a(this, (String)localObject2, "", getString(R.l.dZG), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(9070702493696L, 67582);
        SeeRoomMemberUI.l(SeeRoomMemberUI.this);
        GMTrace.o(9070702493696L, 67582);
      }
    });
    d(paramd.chatroomName, (List)localObject4);
    GMTrace.o(9163178508288L, 68271);
    return;
    label795:
    localObject3 = paramd.kCz;
    localObject4 = localObject2;
    if (localObject3 != null)
    {
      localObject4 = localObject2;
      if (((List)localObject3).size() > 0) {
        localObject4 = (String)localObject2 + getString(R.l.dZW, new Object[] { bg.c(af((List)localObject3), str) });
      }
    }
    List localList = paramd.fGB;
    localObject2 = localObject4;
    localObject3 = localObject1;
    if (localList != null)
    {
      localObject2 = localObject4;
      localObject3 = localObject1;
      if (localList.size() > 0)
      {
        localObject3 = getString(R.l.dtg);
        localObject2 = (String)localObject4 + getString(R.l.ead, new Object[] { bg.c(af(localList), str) });
      }
    }
    localList = paramd.fGz;
    localObject1 = localObject2;
    localObject4 = localObject3;
    if (localList != null)
    {
      localObject1 = localObject2;
      localObject4 = localObject3;
      if (localList.size() > 0)
      {
        localObject4 = getString(R.l.dtg);
        localObject1 = (String)localObject2 + getString(R.l.dZX, new Object[] { bg.c(af(localList), str) });
      }
    }
    localObject3 = paramd.kCA;
    if ((localObject5 == null) || (((List)localObject5).isEmpty()))
    {
      localObject2 = localObject1;
      if (localObject3 != null)
      {
        localObject2 = localObject1;
        if (((List)localObject3).size() <= 0) {}
      }
    }
    else
    {
      localObject2 = new ArrayList();
      ((List)localObject2).addAll((Collection)localObject5);
      ((List)localObject2).addAll((Collection)localObject3);
      d(paramd.chatroomName, (List)localObject5);
      paramd = (String)localObject1 + getString(R.l.dZM, new Object[] { bg.c(af((List)localObject2), str) });
      localObject2 = paramd;
      if (localObject5 != null)
      {
        localObject2 = paramd;
        if (((List)localObject5).isEmpty()) {
          localObject2 = null;
        }
      }
    }
    if ((localObject2 != null) && (((String)localObject2).length() > 0))
    {
      if (i == 0) {
        break label1248;
      }
      com.tencent.mm.ui.base.h.a(this, (String)localObject2, (String)localObject4, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9132039995392L, 68039);
          paramAnonymousDialogInterface = SeeRoomMemberUI.this;
          SeeRoomMemberUI localSeeRoomMemberUI = SeeRoomMemberUI.this;
          SeeRoomMemberUI.k(SeeRoomMemberUI.this);
          SeeRoomMemberUI.a(paramAnonymousDialogInterface, localSeeRoomMemberUI);
          GMTrace.o(9132039995392L, 68039);
        }
      }, null);
    }
    for (;;)
    {
      localq.bPy();
      GMTrace.o(9163178508288L, 68271);
      return;
      label1248:
      com.tencent.mm.ui.base.h.b(this, (String)localObject2, (String)localObject4, true);
    }
  }
  
  private static List<String> af(List<String> paramList)
  {
    GMTrace.i(9163581161472L, 68274);
    LinkedList localLinkedList = new LinkedList();
    if (!ap.AV())
    {
      GMTrace.o(9163581161472L, 68274);
      return localLinkedList;
    }
    if (paramList == null)
    {
      GMTrace.o(9163581161472L, 68274);
      return localLinkedList;
    }
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      ap.AS();
      x localx = c.yL().SL(str);
      paramList = str;
      if (localx != null)
      {
        paramList = str;
        if ((int)localx.gLS != 0) {
          paramList = localx.vq();
        }
      }
      localLinkedList.add(paramList);
    }
    GMTrace.o(9163581161472L, 68274);
    return localLinkedList;
  }
  
  private static boolean amJ()
  {
    GMTrace.i(9163446943744L, 68273);
    if (bg.getInt(com.tencent.mm.k.g.uz().getValue("ChatroomGlobalSwitch"), 1) == 1)
    {
      GMTrace.o(9163446943744L, 68273);
      return true;
    }
    GMTrace.o(9163446943744L, 68273);
    return false;
  }
  
  private void anc()
  {
    GMTrace.i(9162104766464L, 68263);
    ap.AS();
    aa localaa = c.yU();
    if (this.fAJ == null) {}
    for (Object localObject = this.kEr;; localObject = this.fAJ)
    {
      this.kDf = localaa.gm((String)localObject);
      localObject = j.eS(this.kEr);
      if (this.kGi != null) {
        this.kGi.ah((List)localObject);
      }
      GMTrace.o(9162104766464L, 68263);
      return;
    }
  }
  
  private static int ce(Context paramContext)
  {
    GMTrace.i(9161836331008L, 68261);
    if (paramContext == null)
    {
      GMTrace.o(9161836331008L, 68261);
      return 0;
    }
    int i = ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getWidth();
    int j = (int)(paramContext.getResources().getDimension(R.f.aRY) * 2.0F + paramContext.getResources().getDimension(R.f.aSa));
    i = (int)((i - paramContext.getResources().getDimension(R.f.aRV) * 1.0F) / j);
    w.i("MicroMsg.SeeRoomMemberUI", "[getWrapColNum] :%s", new Object[] { Integer.valueOf(i) });
    kGp = i;
    GMTrace.o(9161836331008L, 68261);
    return i;
  }
  
  private void d(String paramString, List<String> paramList)
  {
    GMTrace.i(9163312726016L, 68272);
    if ((paramList != null) && (paramList.size() > 0))
    {
      LinkedList localLinkedList = new LinkedList();
      int i = 0;
      while (i < paramList.size())
      {
        localLinkedList.add(paramList.get(i));
        i += 1;
      }
      paramList = "weixin://findfriend/verifycontact/" + paramString + "/";
      i.a(paramString, localLinkedList, getString(R.l.dHy), true, paramList);
    }
    GMTrace.o(9163312726016L, 68272);
  }
  
  private void n(final String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(9163044290560L, 68270);
    if (!o.ff(paramString1))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.eBw), getString(R.l.dxm), true);
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    if (uB(paramString1))
    {
      com.tencent.mm.ui.base.h.b(this, getString(R.l.dti), getString(R.l.dxm), true);
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    paramString1 = bg.f(paramString1.split(","));
    if (paramString1 == null)
    {
      GMTrace.o(9163044290560L, 68270);
      return;
    }
    paramString1 = new com.tencent.mm.plugin.chatroom.d.d(this.kEr, paramString1, paramString2);
    getString(R.l.dxm);
    this.iXW = com.tencent.mm.ui.base.h.a(this, getString(paramInt), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9098888216576L, 67792);
        ap.wT().c(paramString1);
        GMTrace.o(9098888216576L, 67792);
      }
    });
    ap.wT().a(paramString1, 0);
    GMTrace.o(9163044290560L, 68270);
  }
  
  private void uA(final String paramString)
  {
    GMTrace.i(9162641637376L, 68267);
    if ((paramString == null) || (paramString.equals("")))
    {
      GMTrace.o(9162641637376L, 68267);
      return;
    }
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(paramString);
    paramString = new com.tencent.mm.plugin.chatroom.d.g(this.kEr, localLinkedList);
    getString(R.l.dxm);
    this.iXW = com.tencent.mm.ui.base.h.a(this, getString(R.l.eAN), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(9091237806080L, 67735);
        ap.wT().c(paramString);
        GMTrace.o(9091237806080L, 67735);
      }
    });
    ap.wT().a(paramString, 0);
    GMTrace.o(9162641637376L, 68267);
  }
  
  private boolean uB(String paramString)
  {
    GMTrace.i(9163715379200L, 68275);
    if (bg.mY(m.zF()).equals(paramString))
    {
      GMTrace.o(9163715379200L, 68275);
      return true;
    }
    Object localObject = j.eS(this.kEr);
    if (localObject == null)
    {
      GMTrace.o(9163715379200L, 68275);
      return false;
    }
    localObject = ((List)localObject).iterator();
    boolean bool = false;
    if (((Iterator)localObject).hasNext())
    {
      if (!((String)((Iterator)localObject).next()).equals(paramString)) {
        break label106;
      }
      bool = true;
    }
    label106:
    for (;;)
    {
      break;
      GMTrace.o(9163715379200L, 68275);
      return bool;
    }
  }
  
  protected final void MH()
  {
    GMTrace.i(9161970548736L, 68262);
    rV(this.mTitle + "(" + this.kEH + ")");
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9077950251008L, 67636);
        SeeRoomMemberUI.this.setResult(0);
        SeeRoomMemberUI.this.finish();
        GMTrace.o(9077950251008L, 67636);
        return true;
      }
    });
    this.kGn = ((MMEditText)findViewById(R.h.cer));
    this.kGb = ((GridView)findViewById(R.h.brU));
    this.kGb.setNumColumns(ce(this));
    this.kGb.setColumnWidth(getResources().getDimensionPixelSize(R.f.aRV));
    com.tencent.mm.storage.q localq = this.kDf;
    String str = this.kEr;
    Object localObject = new LinkedList();
    if (!bg.mZ(this.kGj)) {
      localObject = bg.f(this.kGj.split(","));
    }
    ap.AS();
    ay localay = c.yT().BU("@t.qq.com");
    if (localay != null) {
      ((List)localObject).add(localay.name);
    }
    this.kGi = new b(this, localq, str, (List)localObject, this.kEI);
    this.kGn.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9131503124480L, 68035);
        GMTrace.o(9131503124480L, 68035);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9131368906752L, 68034);
        GMTrace.o(9131368906752L, 68034);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9131234689024L, 68033);
        SeeRoomMemberUI.c(SeeRoomMemberUI.this).uC(paramAnonymousCharSequence.toString());
        GMTrace.o(9131234689024L, 68033);
      }
    });
    this.kGb.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9106941280256L, 67852);
        paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).lT(paramAnonymousInt);
        if (paramAnonymousAdapterView.type == 2)
        {
          w.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Add member");
          com.tencent.mm.plugin.report.service.g.paX.a(219L, 6L, 1L, true);
          SeeRoomMemberUI.d(SeeRoomMemberUI.this);
          GMTrace.o(9106941280256L, 67852);
          return;
        }
        if (paramAnonymousAdapterView.type == 3)
        {
          w.i("MicroMsg.SeeRoomMemberUI", "[onItemClick] Delete member");
          SeeRoomMemberUI.e(SeeRoomMemberUI.this);
          GMTrace.o(9106941280256L, 67852);
          return;
        }
        String str;
        if (paramAnonymousAdapterView.type == 1)
        {
          paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).lT(paramAnonymousInt).jqN;
          if (paramAnonymousAdapterView == null)
          {
            w.e("MicroMsg.SeeRoomMemberUI", "cont is null");
            GMTrace.o(9106941280256L, 67852);
            return;
          }
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramAnonymousAdapterView.field_username);
          paramAnonymousView = paramAnonymousAdapterView.field_nickname;
          str = SeeRoomMemberUI.a(SeeRoomMemberUI.f(SeeRoomMemberUI.this), SeeRoomMemberUI.g(SeeRoomMemberUI.this));
          if (!bg.mZ(str)) {
            break label248;
          }
          SeeRoomMemberUI.b(SeeRoomMemberUI.this, paramAnonymousAdapterView.vq());
        }
        for (;;)
        {
          u.j(SeeRoomMemberUI.h(SeeRoomMemberUI.this).getText().toString(), 1, 6, paramAnonymousInt + 1);
          SeeRoomMemberUI.a(SeeRoomMemberUI.this, SeeRoomMemberUI.g(SeeRoomMemberUI.this), SeeRoomMemberUI.i(SeeRoomMemberUI.this), paramAnonymousView);
          GMTrace.o(9106941280256L, 67852);
          return;
          label248:
          SeeRoomMemberUI.b(SeeRoomMemberUI.this, str);
        }
      }
    });
    this.kGb.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, final int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9136334962688L, 68071);
        if (SeeRoomMemberUI.j(SeeRoomMemberUI.this))
        {
          paramAnonymousAdapterView = SeeRoomMemberUI.c(SeeRoomMemberUI.this).lT(paramAnonymousInt).jqN;
          if (paramAnonymousAdapterView == null)
          {
            GMTrace.o(9136334962688L, 68071);
            return true;
          }
          paramAnonymousAdapterView = paramAnonymousAdapterView.field_username;
          if (SeeRoomMemberUI.f(SeeRoomMemberUI.this).field_roomowner.equals(paramAnonymousAdapterView))
          {
            GMTrace.o(9136334962688L, 68071);
            return true;
          }
          com.tencent.mm.ui.base.h.a(SeeRoomMemberUI.this, SeeRoomMemberUI.this.getString(R.l.eAP), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9089627193344L, 67723);
              SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramAnonymousInt);
              GMTrace.o(9089627193344L, 67723);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(9142374760448L, 68116);
              GMTrace.o(9142374760448L, 68116);
            }
          });
        }
        for (;;)
        {
          GMTrace.o(9136334962688L, 68071);
          return true;
          w.i("MicroMsg.SeeRoomMemberUI", "U are not a roomowner");
        }
      }
    });
    this.kGb.setAdapter(this.kGi);
    GMTrace.o(9161970548736L, 68262);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ac.k paramk)
  {
    GMTrace.i(9162775855104L, 68268);
    if ((this.iXW != null) && (this.iXW.isShowing())) {
      this.iXW.dismiss();
    }
    paramString = com.tencent.mm.h.a.dC(paramString);
    if (paramString != null)
    {
      paramString.a(this, null, null);
      GMTrace.o(9162775855104L, 68268);
      return;
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if ((paramk.getType() == 179) && (paramInt2 == -66)) {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.dPL), getString(R.l.dxm), true);
      }
      if (paramk.getType() == 120)
      {
        a(paramInt2, (com.tencent.mm.plugin.chatroom.d.d)paramk);
        GMTrace.o(9162775855104L, 68268);
        return;
      }
      if (paramk.getType() == 610)
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.egV), getString(R.l.dxm), true);
        GMTrace.o(9162775855104L, 68268);
      }
    }
    else if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      switch (paramk.getType())
      {
      }
    }
    for (;;)
    {
      if (this.kDf != null) {
        rV(this.mTitle + "(" + this.kDf.FR().size() + ")");
      }
      GMTrace.o(9162775855104L, 68268);
      return;
      anc();
      continue;
      a(paramInt2, (com.tencent.mm.plugin.chatroom.d.d)paramk);
      anc();
      continue;
      com.tencent.mm.ui.base.h.b(this, getString(R.l.egW), null, true);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9162507419648L, 68266);
    int i = R.i.dfr;
    GMTrace.o(9162507419648L, 68266);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(9162910072832L, 68269);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(9162910072832L, 68269);
      return;
      if (paramIntent == null)
      {
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      String str = paramIntent.getStringExtra("Select_Contact");
      if (!o.ff(str))
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.eBw), getString(R.l.dxm), true);
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      if (uB(str))
      {
        com.tencent.mm.ui.base.h.b(this, getString(R.l.dti), getString(R.l.dxm), true);
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      if (bg.f(str.split(",")) == null)
      {
        GMTrace.o(9162910072832L, 68269);
        return;
      }
      paramIntent = paramIntent.getStringExtra("Select_Contact");
      ap.AS();
      com.tencent.mm.storage.q localq = c.yU().gm(this.kEr);
      if (localq != null)
      {
        if (localq.bPy() == 2)
        {
          com.tencent.mm.pluginsdk.ui.applet.d.a(this.vov, getString(R.l.eAq), getString(R.l.ewU), getString(R.l.dwY), new k.a()
          {
            public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
            {
              GMTrace.i(9147206598656L, 68152);
              if (paramAnonymousBoolean) {
                SeeRoomMemberUI.a(SeeRoomMemberUI.this, paramIntent, paramAnonymousString, R.l.ehe);
              }
              GMTrace.o(9147206598656L, 68152);
            }
          });
          GMTrace.o(9162910072832L, 68269);
          return;
        }
        n(str, null, R.l.dto);
        GMTrace.o(9162910072832L, 68269);
        return;
        if (paramIntent == null)
        {
          GMTrace.o(9162910072832L, 68269);
          return;
        }
        uA(paramIntent.getStringExtra("Select_Contact"));
      }
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    GMTrace.i(9161702113280L, 68260);
    super.onConfigurationChanged(paramConfiguration);
    this.kGb.setNumColumns(ce(this));
    GMTrace.o(9161702113280L, 68260);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9161433677824L, 68258);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.g.paX.a(219L, 2L, 1L, true);
    ap.wT().a(990, this);
    ap.wT().a(179, this);
    ap.wT().a(120, this);
    ap.wT().a(610, this);
    this.kEr = getIntent().getStringExtra("RoomInfo_Id");
    this.fAJ = getIntent().getStringExtra("Chat_User");
    this.kGk = getIntent().getStringExtra("Chatroom_member_list");
    this.fFn = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.kCM = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.kEJ = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.kEI = getIntent().getStringExtra("room_owner_name");
    this.mTitle = getIntent().getStringExtra("Add_address_titile");
    ap.AS();
    aa localaa = c.yU();
    if (this.fAJ == null)
    {
      paramBundle = this.kEr;
      this.kDf = localaa.gm(paramBundle);
      this.kEH = getIntent().getIntExtra("room_member_count", 0);
      this.kEG = getIntent().getStringExtra("room_name");
      this.vv = getIntent().getIntExtra("offset", 0);
      this.kGo = getIntent().getIntExtra("first_pos", 0);
      MH();
      if (this.kGi != null)
      {
        anc();
        paramBundle = this.kGb;
        if (this.kGo * kGp >= this.kGi.getCount()) {
          break label361;
        }
      }
    }
    label361:
    for (int i = this.kGo * kGp;; i = this.kGi.getCount() - 1)
    {
      paramBundle.setSelection(i);
      this.kGb.postDelayed(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9075936985088L, 67621);
          if (Build.VERSION.SDK_INT >= 19)
          {
            SeeRoomMemberUI.b(SeeRoomMemberUI.this).scrollListBy(SeeRoomMemberUI.a(SeeRoomMemberUI.this));
            GMTrace.o(9075936985088L, 67621);
            return;
          }
          GridView localGridView = SeeRoomMemberUI.b(SeeRoomMemberUI.this);
          int i = -SeeRoomMemberUI.a(SeeRoomMemberUI.this);
          int j = -SeeRoomMemberUI.a(SeeRoomMemberUI.this);
          Class localClass1 = Integer.TYPE;
          Class localClass2 = Integer.TYPE;
          SeeRoomMemberUI.b(localGridView, "trackMotionScroll", new Object[] { Integer.valueOf(i), Integer.valueOf(j) }, new Class[] { localClass1, localClass2 });
          GMTrace.o(9075936985088L, 67621);
        }
      }, 100L);
      GMTrace.o(9161433677824L, 68258);
      return;
      paramBundle = this.fAJ;
      break;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9162373201920L, 68265);
    ap.wT().b(990, this);
    ap.wT().b(179, this);
    ap.wT().b(120, this);
    ap.wT().b(610, this);
    if ((this.iXW != null) && (this.iXW.isShowing())) {
      this.iXW.dismiss();
    }
    super.onDestroy();
    GMTrace.o(9162373201920L, 68265);
  }
  
  protected void onPause()
  {
    GMTrace.i(9162238984192L, 68264);
    super.onPause();
    if (this.kGl != null) {
      this.kGl.cfs();
    }
    GMTrace.o(9162238984192L, 68264);
  }
  
  public void onResume()
  {
    GMTrace.i(9161567895552L, 68259);
    super.onResume();
    if (this.kGi != null) {
      this.kGi.uC(this.kGn.getText().toString());
    }
    GMTrace.o(9161567895552L, 68259);
  }
  
  private static final class a
  {
    x jqN;
    int type;
    
    public a(int paramInt, x paramx)
    {
      GMTrace.i(9086942838784L, 67703);
      this.type = paramInt;
      this.jqN = paramx;
      GMTrace.o(9086942838784L, 67703);
    }
  }
  
  private final class b
    extends BaseAdapter
  {
    private List<SeeRoomMemberUI.a> fGw;
    private List<String> jLn;
    private String kDa;
    private com.tencent.mm.storage.q kDf;
    private c kFM;
    public String kGt;
    private boolean kGu;
    private String kGv;
    private List<SeeRoomMemberUI.a> kGw;
    private Context mContext;
    
    public b(com.tencent.mm.storage.q paramq, String paramString1, List<String> paramList, String paramString2)
    {
      GMTrace.i(9099290869760L, 67795);
      this.kGu = false;
      this.kGv = null;
      this.fGw = new ArrayList();
      this.kDf = paramString1;
      this.kDa = paramList;
      this.jLn = paramString2;
      String str;
      this.kGv = str;
      this.mContext = paramq;
      this.kFM = ap.AS();
      ah(j.eS(paramList));
      GMTrace.o(9099290869760L, 67795);
    }
    
    public final void ah(List<String> paramList)
    {
      GMTrace.i(9099425087488L, 67796);
      if (paramList == null)
      {
        GMTrace.o(9099425087488L, 67796);
        return;
      }
      this.fGw.clear();
      int i = 0;
      if (i < paramList.size())
      {
        x localx = c.yL().SL((String)paramList.get(i));
        if ((localx != null) && (localx.field_username.equals(this.kGv))) {
          this.fGw.add(0, new SeeRoomMemberUI.a(1, localx));
        }
        for (;;)
        {
          i += 1;
          break;
          this.fGw.add(new SeeRoomMemberUI.a(1, localx));
        }
      }
      this.fGw.add(new SeeRoomMemberUI.a(2, null));
      if (SeeRoomMemberUI.j(SeeRoomMemberUI.this)) {
        this.fGw.add(new SeeRoomMemberUI.a(3, null));
      }
      this.kGw = this.fGw;
      notifyDataSetChanged();
      GMTrace.o(9099425087488L, 67796);
    }
    
    public final int getCount()
    {
      GMTrace.i(9099961958400L, 67800);
      int i = this.fGw.size();
      GMTrace.o(9099961958400L, 67800);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9100096176128L, 67801);
      long l = paramInt;
      GMTrace.o(9100096176128L, 67801);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9099693522944L, 67798);
      View localView;
      SeeRoomMemberUI.c localc;
      String str;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.dfq, null);
        localc = new SeeRoomMemberUI.c();
        localc.iiL = ((ImageView)localView.findViewById(R.h.cul));
        localc.kjm = ((TextView)localView.findViewById(R.h.cun));
        paramView = (WindowManager)this.mContext.getSystemService("window");
        localc.kjm.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        localView.setTag(localc);
        paramView = (SeeRoomMemberUI.a)this.fGw.get(paramInt);
        if ((paramView == null) || (paramView.type != 1)) {
          break label326;
        }
        x localx = paramView.jqN;
        a.b.a(localc.iiL, localx.field_username);
        str = SeeRoomMemberUI.a(this.kDf, localx.field_username);
        if (bg.mZ(localx.field_conRemark)) {
          break label320;
        }
        paramViewGroup = localx.field_conRemark;
        label183:
        paramView = paramViewGroup;
        if (bg.mZ(paramViewGroup)) {
          paramView = localx.vp();
        }
        paramViewGroup = paramView;
        if (str != null)
        {
          paramViewGroup = paramView;
          if (!str.equals(""))
          {
            paramViewGroup = paramView;
            if (!paramView.equals(str)) {
              paramViewGroup = str + "( " + paramView + " )";
            }
          }
        }
        localc.kjm.setVisibility(0);
        localc.kjm.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramViewGroup, localc.kjm.getTextSize()));
      }
      for (;;)
      {
        GMTrace.o(9099693522944L, 67798);
        return localView;
        localc = (SeeRoomMemberUI.c)paramView.getTag();
        localView = paramView;
        break;
        label320:
        paramViewGroup = str;
        break label183;
        label326:
        if ((paramView != null) && (paramView.type == 2))
        {
          localc.kjm.setVisibility(4);
          localc.iiL.setImageResource(R.g.aWg);
        }
        else if ((paramView != null) && (paramView.type == 3))
        {
          localc.kjm.setVisibility(4);
          localc.iiL.setImageResource(R.g.aWh);
        }
      }
    }
    
    public final SeeRoomMemberUI.a lT(int paramInt)
    {
      GMTrace.i(9099559305216L, 67797);
      SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)this.fGw.get(paramInt);
      GMTrace.o(9099559305216L, 67797);
      return locala;
    }
    
    public final void uC(String paramString)
    {
      GMTrace.i(9099827740672L, 67799);
      this.kGu = true;
      this.kGt = paramString;
      ArrayList localArrayList = new ArrayList();
      if (!bg.mZ(paramString))
      {
        Iterator localIterator = this.kGw.iterator();
        while (localIterator.hasNext())
        {
          SeeRoomMemberUI.a locala = (SeeRoomMemberUI.a)localIterator.next();
          if ((locala != null) && (locala.jqN != null) && (locala.type == 1))
          {
            Object localObject = locala.jqN;
            if ((((af)localObject).field_conRemark != null) && (((af)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((!bg.mZ(SeeRoomMemberUI.a(this.kDf, ((af)localObject).field_username))) && (SeeRoomMemberUI.a(this.kDf, ((af)localObject).field_username).contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).vp() != null) && (((x)localObject).vp().toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qW() != null) && (((x)localObject).qW().toUpperCase().contains(paramString.toUpperCase())))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qV() != null) && (((x)localObject).qV().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((af)localObject).field_username != null) && (((af)localObject).field_username.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if (!com.tencent.mm.l.a.eE(((af)localObject).field_type))
            {
              ap.AS();
              localObject = c.yM().BV(((af)localObject).field_username);
              if ((localObject != null) && (((bb)localObject).field_conRemark != null) && (((bb)localObject).field_conRemark.toUpperCase().contains(paramString.toUpperCase()))) {
                localArrayList.add(locala);
              }
            }
          }
        }
        w.i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
      }
      for (this.fGw = localArrayList;; this.fGw = this.kGw)
      {
        notifyDataSetChanged();
        GMTrace.o(9099827740672L, 67799);
        return;
      }
    }
  }
  
  private static final class c
  {
    public ImageView iiL;
    public TextView kjm;
    
    public c()
    {
      GMTrace.i(9152575307776L, 68192);
      GMTrace.o(9152575307776L, 68192);
    }
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/ui/SeeRoomMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */