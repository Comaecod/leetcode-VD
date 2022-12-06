function longestCommonPrefix(strs) {
  let prefix = strs[0];
  for (const str of strs) {
    while (str.indexOf(prefix) !== 0) {
      prefix = prefix.substring(0, prefix.length - 1);
    }
  }
  return prefix;
}

console.log(longestCommonPrefix(['vishnu', 'vish', 'visa']));
