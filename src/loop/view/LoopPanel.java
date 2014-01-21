package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

/**
 * Panel for the Loop Project
 * @author gsla6260
 * @version 1.1 11/5/13 Basic framework, setupPanel, setupListeners method
 */
public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object linked via the controller for MVC paradigm
	 * @param baseController The linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10,20);
		textPane = new JScrollPane(loopTextArea);
		submitButton = new JButton("click here :D");
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**
	 * adds all components to the panel, sets color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(120, 50, 220));
		this.add(submitButton);
		this.add(textPane);
		this.add(loopTextArea);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopTextArea.append(baseController.getLoopResults());
			}
		});
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, loopTextArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, loopTextArea, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, loopTextArea, 260, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 70, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -79, SpringLayout.EAST, this);
	}
}
