package multiplelinerregression;

/**
 *
 * @author yazmin.salinas
 */

   
    
import javax.swing.table.DefaultTableModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MLR extends javax.swing.JFrame {

    boolean bandera=true;
    private DefaultTableModel modeloTabla=new DefaultTableModel();
    MultipleRegresion rl =new MultipleRegresion();
    double matriz[][]= new double[3][3];
    public MLR() {
        
        initComponents();
        jTable1.setModel(modeloTabla);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        textField2 = new java.awt.TextField();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Multiple Linear Regression");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jTable1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(" B0     +       B1x1     +  B2x2");

        textField3.setName("txtb0"); // NOI18N

        textField4.setName("txtb1"); // NOI18N

        button1.setLabel("Calcular");
        button1.setName("CalcularY"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setName(""); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("B0");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("B1");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("B2");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("X1");

        textField5.setName("txtb1"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("X2");

        textField6.setName("txtb1"); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Y");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel6)
                                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleDescription("");

        jMenu2.setText("Archivo");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Abrir");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jCheckBoxMenuItem1);

        jMenuItem2.setText("Salir");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ejecutar");

        jMenuItem1.setText("Regresion Lineal Multiple");
        jMenuItem1.setName("RegresionSimple"); // NOI18N
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1RegresionLinealSimple(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        textField6.setText("");
        rl.x1= Double.valueOf(textField4.getText());
        rl.x2= Double.valueOf(textField5.getText());
        rl.Y=rl.b0+(rl.b1*rl.x1)+(rl.b2*rl.x2);
        String strY= String.valueOf(rl.Y);
        textField6.setText(strY);
    }//GEN-LAST:event_button1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        File archivoSeleccionado=obtenerArchivo();
        if(archivoSeleccionado!=null){
            try{
                procesarCsv(archivoSeleccionado);
            }
            catch(IOException io)
            {
                System.out.println(io);
            }
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jMenuItem1RegresionLinealSimple(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1RegresionLinealSimple

        rl.n=modeloTabla.getRowCount();
     
       
        modeloTabla.addColumn("x1y"); // TODO add your handling code here:
        modeloTabla.addColumn("x2y"); // TODO add your handling code here:
        modeloTabla.addColumn("x1x2"); // TODO add your handling code here:
        modeloTabla.addColumn("x1sqr"); // TODO add your handling code here:
        modeloTabla.addColumn("x2sqr"); // TODO add your handling code here:
        modeloTabla.addColumn("ysqr"); // TODO add your handling code here:
           int numero=modeloTabla.getColumnCount();
        int a = 0;
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String  valorx1= (String) modeloTabla.getValueAt(i, 0);
            String  valorx2= (String) modeloTabla.getValueAt(i,1);
            String  valory= (String) modeloTabla.getValueAt(i, 2);
            
                      
            
            rl.x1= Double.parseDouble(valorx1);
            rl.x2= Double.parseDouble(valorx2);
            rl.y= Double.parseDouble(valory);
            
       
            
            rl.suma_x1=rl.suma_x1+rl.x1;
            rl.suma_x2=rl.suma_x2+rl.x2;
            rl.suma_y=rl.suma_y+rl.y;
            
            rl.x1y=rl.x1*rl.y;
            rl.x2y=rl.x2*rl.y;
            rl.x1x2=rl.x1*rl.x2;
            
            rl.suma_x1y= rl.suma_x1y+rl.x1y;
            rl.suma_x2y= rl.suma_x2y+rl.x2y;
            rl.suma_x1x2= rl.suma_x1x2+rl.x1x2;
            
            rl.x1_sqr=rl.x1*rl.x1;
            rl.x2_sqr=rl.x2*rl.x2;
            rl.y_sqr=rl.y*rl.y;
            
            rl.suma_x1_sqr=rl.suma_x1_sqr+rl.x1_sqr;
            rl.suma_x2_sqr=rl.suma_x2_sqr+rl.x2_sqr;
            rl.suma_y_sqr=rl.suma_y_sqr+rl.y_sqr;

         
            

            String resultado1=String.valueOf(rl.x1y);
            String resultado2=String.valueOf(rl.x2y);
            String resultado3=String.valueOf(rl.x1x2);
            String resultado4=String.valueOf(rl.x1_sqr);
            String resultado5=String.valueOf(rl.x2_sqr);
            String resultado6=String.valueOf(rl.y_sqr);

            modeloTabla.setValueAt(resultado1, i, 3);
            modeloTabla.setValueAt(resultado2, i, 4);
            modeloTabla.setValueAt(resultado3, i, 5);
            modeloTabla.setValueAt(resultado4, i, 6);
            modeloTabla.setValueAt(resultado5, i, 7);
            modeloTabla.setValueAt(resultado6, i,8);
        }

        
        jLabel1.setText(String.valueOf( rl.suma_y) +" = "  + String.valueOf( rl.n)  +   " B0 "+ String.valueOf( rl.suma_x1) +" B1 "+String.valueOf( rl.suma_x2) +" B2 ");
        
        jLabel2.setText(String.valueOf( rl.suma_x1y) +" = "  + String.valueOf( rl.suma_x1)  +   " B0 "+ String.valueOf( rl.suma_x2_sqr) +" B1 "+String.valueOf( rl.suma_x1x2) +" B2 ");
     
        jLabel4.setText(String.valueOf( rl.suma_x2y) +" = "  + String.valueOf( rl.suma_x2)  +   " B0 "+ String.valueOf( rl.suma_x1x2) +" B1 "+String.valueOf( rl.suma_x2_sqr) +" B2 ");
        
        
        matriz[0][0]=rl.n;
        matriz[0][1]=rl.suma_x1;
        matriz[0][2]=rl.suma_x2;
        
        matriz[1][0]=rl.suma_x1;
        matriz[1][1]=rl.suma_x1_sqr;
        matriz[1][2]=rl.suma_x1x2;
        
        matriz[2][0]=rl.x2;
        matriz[2][1]=rl.suma_x1x2;
        matriz[2][2]=rl.suma_x2_sqr;
        
        
        double MatrizInversa[][] = invert(matriz);
        
        double Mresultado[][]=new double[3][3];
        
        Mresultado[0][0]=rl.suma_y;
        Mresultado[0][1]=rl.suma_x1y;
        Mresultado[0][2]=rl.suma_x2y;
        
        double  MatrizIncoginita[][]=new double[3][3];
                
        MatrizIncoginita = multiply(MatrizInversa,Mresultado);
        
      

        String StrB0=String.valueOf(MatrizIncoginita[0][0]);
        String StrB1=String.valueOf(MatrizIncoginita[0][1]);
        String StrB2=String.valueOf(MatrizIncoginita[0][2]);

        rl.b0=MatrizIncoginita[0][0];
        rl.b1=MatrizIncoginita[0][1];
        rl.b2=MatrizIncoginita[0][2];
                
        
        textField1.setText(StrB0);
        textField2.setText(StrB1);
        textField3.setText(StrB2);

    }//GEN-LAST:event_jMenuItem1RegresionLinealSimple
   
    private File obtenerArchivo(){
       JFileChooser fileChooser=new JFileChooser();
       FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivo de Excel . csv","csv");
       fileChooser.setFileFilter(filtro);
       fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
       int resultado=fileChooser.showOpenDialog(this);
       if(resultado==JFileChooser.CANCEL_OPTION){
            return null;
       }
       else
       {
         File archivoSeleccionado=fileChooser.getSelectedFile();
         return archivoSeleccionado;
       }
      
    }
    
    private void procesarCsv(File archivoSeleccionado)throws IOException{
       BufferedReader input=new BufferedReader(new FileReader(archivoSeleccionado)); 
       String linea;
       String campo;
       ArrayList<String> columnas= new ArrayList<String>();
       while ((linea=input.readLine())!=null)
       {
         ArrayList<String> contenidoFila=new ArrayList<String>();
         int tamaño=linea.length();
         int intAux=0;
         char arregloCadena[]=new char[tamaño];
         arregloCadena=linea.toCharArray();
         for(int i=0;i<tamaño;i++)
         {
            if(arregloCadena[i]==',')
            {
               campo=linea.substring(intAux,i);
               intAux=i+1;
               if(bandera)
               {
                  columnas.add(campo);
               }
               else
               {
                  contenidoFila.add(campo);
               }
            }
            else if(i==tamaño - 1){
                
                   campo=linea.substring(intAux,i+1);
                   if(bandera)
                   {
                      columnas.add(campo);
                      for(int x=0;x<columnas.size();x++)
                      {
                         modeloTabla.addColumn(columnas.get(x));
                      }
                   }
                   else{
                      contenidoFila.add(campo);
                      modeloTabla.addRow(contenidoFila.toArray());
                   }
                   bandera=false;
                       
               }
            }
         }
         input.close();
    }
 
    public static double[][] multiply(double[][] a, double[][] b) {
    double[][] c = new double[a.length][b[0].length];
    // se comprueba si las matrices se pueden multiplicar
    if (a[0].length == b.length) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    // aquí se multiplica la matriz
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
    /**
     * si no se cumple la condición se retorna una matriz vacía
     */
    return c;
}
    
   public static double[][] invert(double a[][])         {
           int n = a.length;
            double x[][] = new double[n][n];
            double b[][] = new double[n][n];
            int index[] = new int[n];
            for (int i=0; i<n; ++i)
                b[i][i] = 1;
            gaussian(a, index);
            for (int i=0; i<n-1; ++i)
                for (int j=i+1; j<n; ++j)
                    for (int k=0; k<n; ++k)
                        b[index[j]][k]
                        	    -= a[index[j]][i]*b[index[i]][k];

            for (int i=0; i<n; ++i)             {
                x[n-1][i] = b[index[n-1]][i]/a[index[n-1]][n-1];
                for (int j=n-2; j>=0; --j)                 {
                    x[j][i] = b[index[j]][i];
                    for (int k=j+1; k<n; ++k)
                    {
                        x[j][i] -= a[index[j]][k]*x[k][i];
                    }

                    x[j][i] /= a[index[j]][j];
                }
            }
            return x;
        }

   public static void gaussian(double a[][], int index[])  {

            int n = index.length;
            double c[] = new double[n];

     // Initialize the index
            for (int i=0; i<n; ++i)
                index[i] = i;

     // Find the rescaling factors, one from each row
            for (int i=0; i<n; ++i) {
                double c1 = 0;
                for (int j=0; j<n; ++j) {
                    double c0 = Math.abs(a[i][j]);
                    if (c0 > c1) c1 = c0;
                }
                c[i] = c1;
            }

     // Search the pivoting element from each column
            int k = 0;
            for (int j=0; j<n-1; ++j) {
                double pi1 = 0;
                for (int i=j; i<n; ++i)  {

                    double pi0 = Math.abs(a[index[i]][j]);
                    pi0 /= c[index[i]];
                    if (pi0 > pi1) {
                        pi1 = pi0;
                        k = i;
                    }
                }

     
       // Interchange rows according to the pivoting order
                int itmp = index[j];
                index[j] = index[k];
                index[k] = itmp;
                for (int i=j+1; i<n; ++i) {
                    double pj = a[index[i]][j]/a[index[j]][j];

     // Record pivoting ratios below the diagonal
                    a[index[i]][j] = pj;

     // Modify other elements accordingly
                    for (int l=j+1; l<n; ++l)
                        a[index[i]][l] -= pj*a[index[j]][l];
                }
            }
        }
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MLR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
