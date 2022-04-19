**Caesar cipher**

Given a lowercase letter and a number between 0 and 26, return that letter Caesar shifted by that number. To Caesar shift a letter by a number, advance it in the alphabet by that many steps, wrapping around from z back to a:

warmup('a', 0) => 'a'

warmup('a', 1) => 'b'

warmup('a', 5) => 'f'

warmup('a', 26) => 'a'

warmup('d', 15) => 's'

warmup('z', 1) => 'a'

warmup('q', 22) => 'm'