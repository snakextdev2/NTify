import os

directory = r'c:\Users\AISTV-PREMIUM\Downloads\NTify-developer\src\main\java\com\spotifyxp'
find_str = 'new DefaultTableModel'
replace_str = 'new com.spotifyxp.guielements.DefTableModel'

for root, dirs, files in os.walk(directory):
    for file in files:
        if file.endswith('.java'):
            filepath = os.path.join(root, file)
            with open(filepath, 'r', encoding='utf-8') as f:
                content = f.read()
            if find_str in content:
                new_content = content.replace(find_str, replace_str)
                with open(filepath, 'w', encoding='utf-8') as f:
                    f.write(new_content)
                print(f"Updated {filepath}")
