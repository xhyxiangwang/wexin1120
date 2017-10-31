package com.tencent.mm.plugin.qqmail.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.k;
import com.tencent.mm.ac.n;
import com.tencent.mm.bq.a;
import com.tencent.mm.plugin.qqmail.b.h.d;
import com.tencent.mm.plugin.qqmail.b.o;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.a;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.b.y;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.protocal.c.bjr;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.x.ap;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements e
{
  public int mode;
  private TextView oHs;
  private ImageView oHt;
  public ComposeUI oIV;
  public ViewGroup oIW;
  public Map<String, y> oIX;
  public Map<String, o> oIY;
  public Map<String, String> oIZ;
  public Map<String, String> oJa;
  b oJb;
  private View.OnClickListener oJc;
  
  private b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5558492987392L, 41414);
    this.oIX = new HashMap();
    this.oIY = new HashMap();
    this.oIZ = new LinkedHashMap();
    this.oJa = new LinkedHashMap();
    this.oJb = null;
    this.oJc = null;
    this.mode = 5;
    this.oIV = paramComposeUI;
    this.oIW = paramViewGroup;
    this.oJc = null;
    this.oHs = paramTextView;
    this.oHt = paramImageView;
    aXA();
    ap.wT().a(484, this);
    GMTrace.o(5558492987392L, 41414);
  }
  
  public b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup, byte paramByte)
  {
    this(paramComposeUI, paramTextView, paramImageView, paramViewGroup);
    GMTrace.i(5558627205120L, 41415);
    GMTrace.o(5558627205120L, 41415);
  }
  
  private void a(final y paramy)
  {
    GMTrace.i(5559029858304L, 41418);
    final LinearLayout localLinearLayout = (LinearLayout)((ViewGroup)View.inflate(this.oIV, R.i.ddo, null)).findViewById(R.h.cjP);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(R.h.cjO);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(R.h.cjQ);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(R.h.cjS);
    ProgressBar localProgressBar = (ProgressBar)localLinearLayout.findViewById(R.h.cjT);
    TextView localTextView3 = (TextView)localLinearLayout.findViewById(R.h.cjU);
    final ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(R.h.cjR);
    ImageView localImageView3 = (ImageView)localLinearLayout.findViewById(R.h.cjN);
    ((ViewGroup)localLinearLayout.getParent()).removeView(localLinearLayout);
    localImageView1.setImageResource(FileExplorerUI.OM(paramy.name));
    localTextView1.setText(paramy.name);
    localTextView2.setText(bg.aD(paramy.size));
    a locala = new a();
    locala.jjR = localImageView1;
    locala.kIZ = localTextView1;
    locala.oIE = localTextView2;
    locala.oJl = localProgressBar;
    locala.oJm = localTextView3;
    locala.oJn = localImageView2;
    locala.oJo = localImageView3;
    localLinearLayout.setTag(locala);
    localLinearLayout.setId(Math.abs(paramy.path.hashCode() / 2));
    if (this.oJc != null) {
      localLinearLayout.setOnClickListener(this.oJc);
    }
    this.oIW.addView(localLinearLayout);
    aXA();
    localLinearLayout.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5521448894464L, 41138);
        if (localImageView2.getVisibility() == 0) {
          localImageView2.performClick();
        }
        GMTrace.o(5521448894464L, 41138);
      }
    });
    localImageView2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5501316235264L, 40988);
        long l;
        if (b.this.mode == 5)
        {
          l = b.this.Eq(paramy.path);
          paramy.oGJ = l;
          GMTrace.o(5501316235264L, 40988);
          return;
        }
        if (b.this.mode == 6)
        {
          l = b.this.de(paramy.path, paramy.name);
          paramy.oGJ = l;
        }
        GMTrace.o(5501316235264L, 40988);
      }
    });
    localImageView3.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5521180459008L, 41136);
        h.a(b.this.oIV, R.l.euo, R.l.dxm, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(5545205432320L, 41315);
            y localy;
            if ((b.3.this.oJf.state == 0) || (b.3.this.oJf.state == 1))
            {
              paramAnonymous2DialogInterface = b.this;
              localy = b.3.this.oJf;
              if (paramAnonymous2DialogInterface.mode != 5) {
                break label212;
              }
              com.tencent.mm.plugin.qqmail.b.w.aXa().cancel(localy.oGJ);
            }
            for (;;)
            {
              b.this.oIX.remove(b.3.this.oJf.path);
              b.this.oIY.remove(b.3.this.oJf.path);
              b.this.oIZ.remove(b.3.this.oJf.path);
              b.this.oJa.remove(b.3.this.oJf.path);
              b.this.oIW.removeView(b.3.this.oJg);
              b.this.aXA();
              GMTrace.o(5545205432320L, 41315);
              return;
              label212:
              if (paramAnonymous2DialogInterface.mode == 6)
              {
                o localo = (o)paramAnonymous2DialogInterface.oIY.get(localy.path);
                if (localo != null) {
                  ap.wT().c(localo);
                }
                paramAnonymous2DialogInterface.oIZ.remove(localy.path);
                paramAnonymous2DialogInterface.oJa.remove(localy.path);
              }
            }
          }
        }, null);
        GMTrace.o(5521180459008L, 41136);
      }
    });
    this.oIW.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(5564935438336L, 41462);
        b.this.b(paramy);
        GMTrace.o(5564935438336L, 41462);
      }
    });
    if (paramy.state == 0)
    {
      if (this.mode == 5)
      {
        paramy.oGJ = Eq(paramy.path);
        GMTrace.o(5559029858304L, 41418);
        return;
      }
      if (this.mode == 6) {
        paramy.oGJ = de(paramy.path, paramy.name);
      }
    }
    GMTrace.o(5559029858304L, 41418);
  }
  
  public final long Eq(final String paramString)
  {
    GMTrace.i(5559566729216L, 41422);
    p.c localc = new p.c();
    localc.oFU = false;
    localc.oFT = true;
    p localp = com.tencent.mm.plugin.qqmail.b.w.aXa();
    p.a local5 = new p.a()
    {
      public final void onComplete()
      {
        GMTrace.i(5478230786048L, 40816);
        b.this.aXz();
        GMTrace.o(5478230786048L, 40816);
      }
      
      public final void onError(int paramAnonymousInt, String paramAnonymousString)
      {
        GMTrace.i(5478096568320L, 40815);
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.FileUploadHelper", "errCode:%d, desc:%s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousString });
        paramAnonymousString = (y)b.this.oIX.get(paramString);
        if (paramAnonymousString != null)
        {
          paramAnonymousString.state = 3;
          b.this.b(paramAnonymousString);
        }
        if (paramAnonymousInt == -5)
        {
          b.this.oIV.oHA.a(new c.a()
          {
            public final void aXd()
            {
              GMTrace.i(5502792630272L, 40999);
              GMTrace.o(5502792630272L, 40999);
            }
            
            public final void aXe()
            {
              GMTrace.i(5502926848000L, 41000);
              GMTrace.o(5502926848000L, 41000);
            }
          });
          GMTrace.o(5478096568320L, 40815);
          return;
        }
        GMTrace.o(5478096568320L, 40815);
      }
      
      public final boolean onReady()
      {
        GMTrace.i(5477828132864L, 40813);
        y localy = (y)b.this.oIX.get(paramString);
        if (localy != null)
        {
          localy.state = 1;
          b.this.b(localy);
        }
        GMTrace.o(5477828132864L, 40813);
        return true;
      }
      
      public final void onSuccess(String paramAnonymousString, Map<String, String> paramAnonymousMap)
      {
        GMTrace.i(5477962350592L, 40814);
        paramAnonymousString = (String)paramAnonymousMap.get(".Response.result.DataID");
        paramAnonymousMap = (y)b.this.oIX.get(paramString);
        if (paramAnonymousMap != null)
        {
          paramAnonymousMap.state = 2;
          paramAnonymousMap.oGK = paramAnonymousString;
          b.this.b(paramAnonymousMap);
        }
        GMTrace.o(5477962350592L, 40814);
      }
    };
    long l = localp.a("/cgi-bin/uploaddata", 1, null, new h.d("UploadFile", paramString), localc, local5);
    GMTrace.o(5559566729216L, 41422);
    return l;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(5560372035584L, 41428);
    if (paramk.getType() == 484)
    {
      paramString = (o)paramk;
      paramk = paramString.filePath;
      final y localy = (y)this.oIX.get(paramk);
      if ((localy != null) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.FileUploadHelper", "upload error, errType: %d, errCode: %d, file: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramk });
        localy.state = 3;
        this.oIY.remove(paramk);
        ap.wT().c(paramString);
        af.u(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5486418067456L, 40877);
            b.this.b(localy);
            GMTrace.o(5486418067456L, 40877);
          }
        });
      }
    }
    GMTrace.o(5560372035584L, 41428);
  }
  
  public final void aXA()
  {
    GMTrace.i(5559969382400L, 41425);
    int j;
    int i;
    if (this.oIX.size() == 0)
    {
      this.oHs.setText(this.oIV.getString(R.l.euu) + " " + this.oIV.getString(R.l.eux));
      this.oHt.setImageResource(R.k.dqh);
      ((View)this.oIW.getParent()).setVisibility(8);
      j = this.oIW.getChildCount();
      i = 0;
      label105:
      if (i >= j) {
        break label314;
      }
      if (j != 1) {
        break label248;
      }
      this.oIW.getChildAt(i).setBackgroundResource(R.g.bav);
    }
    for (;;)
    {
      i += 1;
      break label105;
      this.oHs.setText(this.oIV.getString(R.l.euu) + this.oIV.getResources().getQuantityString(R.j.dkr, this.oIX.size(), new Object[] { Integer.valueOf(this.oIX.size()), bg.aD(aXB()) }));
      this.oHt.setImageResource(R.k.dqi);
      ((View)this.oIW.getParent()).setVisibility(0);
      break;
      label248:
      if (i == 0) {
        this.oIW.getChildAt(i).setBackgroundResource(R.g.baw);
      } else if ((i > 0) && (i < j - 1)) {
        this.oIW.getChildAt(i).setBackgroundResource(R.g.bax);
      } else {
        this.oIW.getChildAt(i).setBackgroundResource(R.g.bay);
      }
    }
    label314:
    GMTrace.o(5559969382400L, 41425);
  }
  
  public final int aXB()
  {
    GMTrace.i(5560103600128L, 41426);
    Iterator localIterator = this.oIX.keySet().iterator();
    String str;
    long l;
    for (int i = 0; localIterator.hasNext(); i = (int)(((y)this.oIX.get(str)).size + l))
    {
      str = (String)localIterator.next();
      l = i;
    }
    GMTrace.o(5560103600128L, 41426);
    return i;
  }
  
  public final String aXv()
  {
    GMTrace.i(5559164076032L, 41419);
    String str1 = "";
    Iterator localIterator = this.oIX.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      String str2 = str1;
      if (str1.length() > 0) {
        str2 = str1 + "|";
      }
      str1 = str2 + ((y)this.oIX.get(str3)).oGK;
    }
    GMTrace.o(5559164076032L, 41419);
    return str1;
  }
  
  public final LinkedList<y> aXw()
  {
    GMTrace.i(5559298293760L, 41420);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.oIX.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(this.oIX.get(str));
    }
    GMTrace.o(5559298293760L, 41420);
    return localLinkedList;
  }
  
  public final void aXx()
  {
    GMTrace.i(5559432511488L, 41421);
    Iterator localIterator;
    Object localObject;
    if (this.mode == 5)
    {
      localIterator = this.oIX.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.oIX.get(localObject);
        if (((y)localObject).state != 2)
        {
          com.tencent.mm.plugin.qqmail.b.w.aXa().cancel(((y)localObject).oGJ);
          ((y)localObject).state = 3;
          b((y)localObject);
        }
      }
      GMTrace.o(5559432511488L, 41421);
      return;
    }
    if (this.mode == 6)
    {
      localIterator = this.oIX.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.oIX.get(localObject);
        if (((y)localObject).state != 2)
        {
          o localo = (o)this.oIY.get(((y)localObject).path);
          if (localo != null)
          {
            ap.wT().c(localo);
            ((y)localObject).state = 3;
            b((y)localObject);
          }
          this.oIZ.remove(((y)localObject).path);
          this.oJa.remove(((y)localObject).path);
          this.oIY.remove(((y)localObject).path);
        }
      }
    }
    GMTrace.o(5559432511488L, 41421);
  }
  
  public final boolean aXy()
  {
    GMTrace.i(5559835164672L, 41424);
    Iterator localIterator = this.oIX.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (y)this.oIX.get(localObject);
      if ((((y)localObject).state != 2) && (((y)localObject).state != 3))
      {
        GMTrace.o(5559835164672L, 41424);
        return false;
      }
    }
    GMTrace.o(5559835164672L, 41424);
    return true;
  }
  
  public final void aXz()
  {
    GMTrace.i(16027341553664L, 119413);
    Object localObject1;
    Object localObject2;
    if (!aXy())
    {
      if (this.oJb != null)
      {
        localObject1 = this.oJb;
        this.oIX.size();
        localObject2 = this.oIX.keySet().iterator();
        String str;
        do
        {
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          str = (String)((Iterator)localObject2).next();
        } while (((y)this.oIX.get(str)).state == 2);
        ((b)localObject1).aXq();
        GMTrace.o(16027341553664L, 119413);
      }
    }
    else
    {
      localObject1 = this.oIX.keySet().iterator();
      do
      {
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localObject2 = (String)((Iterator)localObject1).next();
      } while (((y)this.oIX.get(localObject2)).state == 2);
      for (int i = 0; i == 0; i = 1)
      {
        GMTrace.o(16027341553664L, 119413);
        return;
      }
      if (this.oJb != null) {
        this.oJb.onComplete();
      }
    }
    GMTrace.o(16027341553664L, 119413);
  }
  
  public final void b(y paramy)
  {
    GMTrace.i(5560237817856L, 41427);
    int i = Math.abs(paramy.path.hashCode() / 2);
    Object localObject = (LinearLayout)this.oIW.findViewById(i);
    if (localObject == null)
    {
      GMTrace.o(5560237817856L, 41427);
      return;
    }
    localObject = (a)((LinearLayout)localObject).getTag();
    switch (paramy.state)
    {
    }
    for (;;)
    {
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).kIZ.setTextColor(-16777216);
      ((a)localObject).oJl.setVisibility(0);
      ((a)localObject).oJm.setVisibility(8);
      ((a)localObject).oJn.setVisibility(8);
      ((a)localObject).oJo.setVisibility(0);
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).kIZ.setTextColor(-16777216);
      ((a)localObject).oJl.setVisibility(8);
      ((a)localObject).oJm.setVisibility(8);
      ((a)localObject).oJn.setVisibility(8);
      ((a)localObject).oJo.setVisibility(0);
      GMTrace.o(5560237817856L, 41427);
      return;
      ((a)localObject).kIZ.setTextColor(a.c(this.oIV, R.e.aOT));
      ((a)localObject).oJl.setVisibility(8);
      ((a)localObject).oJm.setVisibility(0);
      ((a)localObject).oJn.setVisibility(0);
      ((a)localObject).oJo.setVisibility(0);
    }
  }
  
  public final void bc(List<y> paramList)
  {
    GMTrace.i(5558761422848L, 41416);
    if (paramList == null)
    {
      GMTrace.o(5558761422848L, 41416);
      return;
    }
    Object localObject = paramList.iterator();
    while (((Iterator)localObject).hasNext())
    {
      y localy = (y)((Iterator)localObject).next();
      a(localy);
      this.oIX.put(localy.path, localy);
    }
    if (this.mode == 6)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        localObject = (y)paramList.next();
        this.oIZ.put(((y)localObject).path, ((y)localObject).oGK);
        this.oJa.put(((y)localObject).path, ((y)localObject).name);
      }
    }
    GMTrace.o(5558761422848L, 41416);
  }
  
  public final void dd(String paramString1, String paramString2)
  {
    GMTrace.i(5558895640576L, 41417);
    if ((paramString1 == null) || (paramString1.length() == 0) || (this.oIX.containsKey(paramString1)))
    {
      GMTrace.o(5558895640576L, 41417);
      return;
    }
    File localFile = new File(paramString1);
    if ((!localFile.exists()) || (!localFile.isFile()))
    {
      GMTrace.o(5558895640576L, 41417);
      return;
    }
    y localy = new y();
    localy.path = paramString1;
    if (paramString2 == null) {}
    for (localy.name = localFile.getName();; localy.name = paramString2)
    {
      localy.size = localFile.length();
      localy.state = 0;
      this.oIX.put(paramString1, localy);
      a(localy);
      GMTrace.o(5558895640576L, 41417);
      return;
    }
  }
  
  public final long de(final String paramString1, final String paramString2)
  {
    GMTrace.i(5559700946944L, 41423);
    if (this.oIY.containsKey(paramString1))
    {
      l = ((o)this.oIY.get(paramString1)).hashCode();
      GMTrace.o(5559700946944L, 41423);
      return l;
    }
    paramString2 = new o(paramString1, paramString1, new f()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final k paramAnonymousk)
      {
        GMTrace.i(5504403243008L, 41011);
        com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "offset: %d, totalLen: %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (paramAnonymousInt1 < paramAnonymousInt2)
        {
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "uploading file: %s, offset: %d, totalLen: %d", new Object[] { paramString1, Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
          paramAnonymousk = (y)b.this.oIX.get(paramString1);
          if (paramAnonymousk != null)
          {
            paramAnonymousk.state = 1;
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5489102422016L, 40897);
                b.this.b(paramAnonymousk);
                GMTrace.o(5489102422016L, 40897);
              }
            });
          }
          GMTrace.o(5504403243008L, 41011);
          return;
        }
        if (paramAnonymousInt1 >= paramAnonymousInt2)
        {
          final y localy = (y)b.this.oIX.get(paramString1);
          paramAnonymousk = ((o)paramAnonymousk).aWU().tKf;
          b.this.oIZ.put(paramString1, paramAnonymousk);
          b.this.oJa.put(paramString1, paramString2);
          b.this.oIY.remove(paramString1);
          com.tencent.mm.sdk.platformtools.w.i("MicroMsg.FileUploadHelper", "finish uploaded file: %s, attachId: %s", new Object[] { paramString1, paramAnonymousk });
          if (localy != null)
          {
            localy.state = 2;
            localy.oGK = paramAnonymousk;
            af.u(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(5507490250752L, 41034);
                b.this.b(localy);
                GMTrace.o(5507490250752L, 41034);
              }
            });
          }
          b.this.aXz();
        }
        GMTrace.o(5504403243008L, 41011);
      }
    });
    y localy = (y)this.oIX.get(paramString1);
    if (localy != null) {
      localy.state = 1;
    }
    b(localy);
    ap.wT().a(paramString2, 0);
    this.oIY.put(paramString1, paramString2);
    long l = paramString2.hashCode();
    GMTrace.o(5559700946944L, 41423);
    return l;
  }
  
  private final class a
  {
    ImageView jjR;
    TextView kIZ;
    TextView oIE;
    ProgressBar oJl;
    TextView oJm;
    ImageView oJn;
    ImageView oJo;
    
    public a()
    {
      GMTrace.i(5478365003776L, 40817);
      GMTrace.o(5478365003776L, 40817);
    }
  }
  
  public static abstract interface b
  {
    public abstract void aXq();
    
    public abstract void onComplete();
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */