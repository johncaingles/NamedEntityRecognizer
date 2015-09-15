package view;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {
	String filepath = "";
			
	public String promptUserForFile() {
			try {
			JFileChooser fileOpen = new JFileChooser();
			String[] suffices = ImageIO.getReaderFileSuffixes();
				for (int i = 0; i < suffices.length; i++)
				{
					FileFilter filter = new FileNameExtensionFilter(
							suffices[i] + " files", suffices[i]);
					fileOpen.addChoosableFileFilter(filter);
				}
			int ret = fileOpen.showDialog(null, "Open file");
			filepath = fileOpen.getSelectedFile().getAbsolutePath();
			//imageLocation = imageLocation.replace('\\', '/');
			//BufferedImage img = null;
			/*try
			{
		                           File source = new File(fileOpen.getSelectedFile().getAbsolutePath());
		                           File dest = new File("src/resources/"+source.getName()); 
		                           copyFileUsingJava7Files(source,dest);    // move file to resource folder
		                           imageLocation = dest.getPath().replace('\\', '/');
				img = ImageIO.read(dest);
				Image dimg = img.getScaledInstance(lblImage.getWidth(),
						lblImage.getHeight(), Image.SCALE_DEFAULT);
				ImageIcon imageIcon = new ImageIcon(dimg);
				lblImage.setIcon(imageIcon);
			} catch (Exception ioe)
			{
				JOptionPane
						.showMessageDialog(null,
								"Selected file is not an image. Please try again.");
			}*/
		
		} catch (Exception exc)
		{
			System.out.println(filepath);
		}
			
		return filepath;
	}
		                
}

