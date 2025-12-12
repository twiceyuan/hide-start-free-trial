# Hide "Start Free Trial" Plugin

一个简单的 JetBrains IDE 插件，用于隐藏工具栏上无法通过常规设置移除的 "Start Free Trial" (开始免费试用) 按钮。

[English](#english) | [中文](#中文)

---

## 中文

### 简介
在较新版本的 JetBrains IDE (如 PyCharm 2025.x) 中，工具栏上可能会出现一个 "Start Free Trial" 按钮。这个按钮无法通过 "Menus and Toolbars" 设置进行隐藏，对于不喜欢界面杂乱的用户来说可能比较困扰。

本插件通过查找并隐藏 IDE 内部的 `TrialStateButton` 组件，帮你移除这个按钮，还你一个清爽的界面。

### 安装方法
1. 下载最新发行版 (`.zip` 文件)。
2. 打开 IDE，进入 **设置 (Settings/Preferences)** -> **插件 (Plugins)**。
3. 点击齿轮图标 ⚙️，选择 **"Install Plugin from Disk..."**。
4. 选择下载的 `.zip` 文件并安装。
5. 重启 IDE。

### 如何构建
如果你想自己构建插件：

```bash
git clone https://github.com/yourusername/hide-start-free-trial.git
cd hide-start-free-trial
./gradlew buildPlugin
```

构建完成后，插件文件位于 `build/distributions/` 目录下。

### 支持版本
- 支持 IntelliJ Platform 231 (2023.1) 及更高版本。
- 已在 PyCharm 2025.2 EAP (Build 252.x) 上测试通过。

---

## English

### Introduction
In newer versions of JetBrains IDEs (like PyCharm 2025.x), a "Start Free Trial" button may appear on the toolbar. This button cannot be hidden via the standard "Menus and Toolbars" settings.

This plugin programmatically identifies and hides the internal `TrialStateButton` component to remove this button from your interface.

### Installation
1. Download the latest release (`.zip` file).
2. Open your IDE and go to **Settings/Preferences** -> **Plugins**.
3. Click the gear icon ⚙️ and select **"Install Plugin from Disk..."**.
4. Select the downloaded `.zip` file.
5. Restart the IDE.

### How to Build
To build the plugin from source:

```bash
git clone https://github.com/yourusername/hide-start-free-trial.git
cd hide-start-free-trial
./gradlew buildPlugin
```

The generated plugin `.zip` will be located in `build/distributions/`.

### Compatibility
- Supports IntelliJ Platform 231 (2023.1) and later.
- Tested on PyCharm 2025.2 EAP (Build 252.x).
