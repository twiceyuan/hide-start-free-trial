package com.twiceyuan.hidefreetrial

import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity
import com.intellij.openapi.wm.WindowManager
import java.awt.Component
import java.awt.Container
import java.util.Timer
import java.util.TimerTask
import javax.swing.SwingUtilities

class HideTrialButtonActivity : StartupActivity.DumbAware {

    private val logger = Logger.getInstance(HideTrialButtonActivity::class.java)

    override fun runActivity(project: Project) {
        SwingUtilities.invokeLater {
            val frame = WindowManager.getInstance().getFrame(project)
            if (frame != null) {
                traverseAndHide(frame)
            }
        }
    }

    private fun traverseAndHide(container: Container) {
        val components = container.components
        for (component in components) {
            if (isTrialButton(component)) {
                if (component.isVisible) {
                    component.isVisible = false
                    logger.info("Hidden 'Start Free Trial' button (${component.javaClass.simpleName})")
                }
            }
            
            if (component is Container) {
                traverseAndHide(component)
            }
        }
    }

    private fun isTrialButton(component: Component): Boolean {
        val simpleName = component.javaClass.simpleName
        val className = component.javaClass.name
        
        // Target the specific classes identified in debugging
        return simpleName.equals("TrialStateButton", ignoreCase = true) || 
               className.endsWith("TrialStateButton") ||
               simpleName.equals("TrialStateButtonWrapper", ignoreCase = true) ||
               className.endsWith("TrialStateButtonWrapper")
    }
}
