Huffman Text Compressor and Decompressor

Overview
This project implements a text compression and decompression tool using Huffman coding. The program leverages heaps/priority queues and hashmaps to efficiently compress text, reducing its size, and decompress it back to its original form.

Features
Compression: Reduces the size of text files using Huffman encoding.
Decompression: Restores the compressed file to its original state.
Efficiency: Implements priority queues (heaps) for optimal Huffman tree construction.
Custom Encoding: Generates unique binary codes for each character based on frequency.


How It Works
Build Frequency Map: Analyzes the text to count character occurrences using a hashmap.
Construct Huffman Tree: Uses a priority queue to construct the tree based on character frequencies.
Generate Codes: Assigns binary codes to characters by traversing the Huffman tree.
Compression: Replaces text with its binary representation.
Decompression: Reconstructs the original text using the binary codes and the Huffman tree.
