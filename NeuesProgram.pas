PROGRAM NeuesProgram;
USES Crt;

var day, vegetarian, ans: string;

begin
repeat   
    ClrScr;
 
    Write('Are you vegetarian? [y/N] ');
    ReadLn(vegetarian);

    Write('On which bloody day ja wanna eat, mate? [m/t/w/th/f] ');
    ReadLn(day);

    case day of
        'm': 
            if vegetarian = 'y' then begin
                Write('Dann gibts Salat!');
                end else begin 
                Write('Freu dich! Es gibt Kotlett!');
            end;
        't':
            if vegetarian = 'y' then begin
                Write('Dann gibts Fisch!');
                end else begin 
                Write('Freu dich! Es gibt Rippchen!');
            end;
        'w':
            if vegetarian = 'y' then begin
                Write('Dann gibts Käse!');
                end else begin 
                Write('Freu dich! Es gibt Wurst!');
            end;
        'th':
            if vegetarian = 'y' then begin
                Write('Dann gibts Nudeln!');
                end else begin 
                Write('Freu dich! Es gibt Steak!');
            end;
        'f':
            if vegetarian = 'y' then begin
                Write('Dann gibts Gulag!');
                end else begin 
                Write('Freu dich! Es gibt Steak!');
            end;
        
        else
        begin
            Write('Don´t Fuck with me, make your own Food!');
        end;
    end;

    Writeln();
    Write('Repeat? [y/N] ');
    ReadLn(ans);
    until ans='';
end.