text = "X-DSPAM-Confidence:    0.8475";
x = text.find(':')
s_number = text[19:len(text)]
s_number = s_number.strip()
print(float(s_number))

