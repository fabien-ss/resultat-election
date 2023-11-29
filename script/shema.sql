create table candidat(
    numerocandidat int primary key,
    nom varchar(100) not null,
    partie varchar(100)
);    

    insert into candidat(numerocandidat, nom, partie)
    values 
    (1, 'RAZAFINJOELINA Tahina', 'FTT'),
    (2,'ANDRIANAINARIVELO Hajo Herivelona', 'MMM1'),
    (3, 'RAJOELINA Andry Nirina', 'TGV'),
    (4,'RATSIRAKA Iarovana Roland', 'MTS'),
    (5, 'RAVALOMANANA Marc', 'TIM'),
    (6,'PARAINA Auguste Richard', 'TT'),
    (7,'RAOBELINA ANDRIAMALALA Andry Tsiverizo','ARB'),
    (8,'RAZAFINTSIANDRAOFA Jean Brunelle', 'APM'),
    (9,'RATSIRAHONANA Lalaina Harilanto', 'Antoko Fihavanantsika An i Kristy'),
    (10,'RAJAONARIMAMPIANINA RAKOTOARIMANANA Hery Martial', 'HVM'),
    (11,'RADERANIRINA Sendrison Daniela', 'Fy-M'),
    (12,'RATSIETISON Jean-Jacques Jedidia','FMI-Ma1'),
    (13,'RANDRIANASOLONIAIKO Siteny Thierry', 'Pro siteny 150 elus');

create table resultat(
    bureauVote varchar(255) not null,
    commune varchar(255) not null,
    region varchar(255) not null,
    district varchar(255) not null,
    numerocandidat int references candidat(numerocandidat),
    voixobtenu double precision default 0
);

create table details_bureau(
    numeroBv varchar(30),
    commune varchar(30),
    region varchar(30),
    district varchar(30),
    suffrageExprime double precision,
    suffrageBlanc double precision,
    suffrageNul double precision,
    inscrit double precision
);


alter table resultat add column votant double precision;;


create or replace view
v_resultat as select COALESCE(voixobtenu, 0) resultat, BureauVote,Commune,Region,District,Numerocandidat from resultat;

create or replace view
v_resultat_final as select sum(resultat) from v_resultat group by numerocandidat;


create or replace view 
resultat_final as 
select sum(r.voixobtenu * 100) / (select sum(voixobtenu) from resultat), r.numerocandidat , c.nom, c.partie, r.commune, r.region, r.district from resultat r
join candidat c on c.numerocandidat = r.numerocandidat
 group by r.numerocandidat,c.nom, c.partie ;