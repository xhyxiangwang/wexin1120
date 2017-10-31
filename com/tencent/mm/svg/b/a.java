package com.tencent.mm.svg.b;

import com.tencent.gmtrace.GMTrace;
import java.lang.reflect.Field;

public final class a<T>
{
  private String classname;
  private String fieldName;
  private boolean gJV;
  public Field gJW;
  public Object obj;
  
  public a(Object paramObject, String paramString)
  {
    GMTrace.i(3481205211136L, 25937);
    if (paramObject == null) {
      throw new IllegalArgumentException("obj cannot be null");
    }
    this.obj = paramObject;
    this.fieldName = paramString;
    this.classname = null;
    GMTrace.o(3481205211136L, 25937);
  }
  
  public final T get()
  {
    GMTrace.i(3481473646592L, 25939);
    prepare();
    if (this.gJW == null) {
      throw new NoSuchFieldException();
    }
    try
    {
      Object localObject = this.gJW.get(this.obj);
      GMTrace.o(3481473646592L, 25939);
      return (T)localObject;
    }
    catch (ClassCastException localClassCastException)
    {
      throw new IllegalArgumentException("unable to cast object");
    }
  }
  
  public final void prepare()
  {
    GMTrace.i(3481339428864L, 25938);
    if (this.gJV)
    {
      GMTrace.o(3481339428864L, 25938);
      return;
    }
    this.gJV = true;
    Class localClass = this.obj.getClass();
    while (localClass != null) {
      try
      {
        Field localField1 = localClass.getDeclaredField(this.fieldName);
        localField1.setAccessible(true);
        this.gJW = localField1;
        localClass.getSuperclass();
        GMTrace.o(3481339428864L, 25938);
        return;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          try
          {
            if ((this.classname != null) && (!this.classname.equals("")))
            {
              Field[] arrayOfField = localClass.getDeclaredFields();
              int j = arrayOfField.length;
              i = 0;
              if (i < j)
              {
                Field localField2 = arrayOfField[i];
                if (!localField2.getType().getName().equals(this.classname)) {
                  continue;
                }
                localField2.setAccessible(true);
                this.gJW = localField2;
              }
            }
          }
          catch (Exception localException2)
          {
            int i;
            continue;
          }
          localClass = localClass.getSuperclass();
          break;
          i += 1;
        }
      }
      finally
      {
        localClass.getSuperclass();
      }
    }
    GMTrace.o(3481339428864L, 25938);
  }
}


/* Location:              /Users/xianghongyan/decompile/dex2jar/classes2-dex2jar.jar!/com/tencent/mm/svg/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */