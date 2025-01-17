PGDMP  3    7                |            enrollment_db    16.1    16.1 +    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    17753    enrollment_db    DATABASE     �   CREATE DATABASE enrollment_db WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_Indonesia.1252';
    DROP DATABASE enrollment_db;
                postgres    false            �            1259    17831    enroll    TABLE     P   CREATE TABLE public.enroll (
    id integer NOT NULL,
    student_id integer
);
    DROP TABLE public.enroll;
       public         heap    postgres    false            �            1259    17843    enroll_detail    TABLE     �   CREATE TABLE public.enroll_detail (
    id integer NOT NULL,
    enroll_id integer,
    course_id integer,
    period_id integer
);
 !   DROP TABLE public.enroll_detail;
       public         heap    postgres    false            �            1259    17842    enroll_detail_id_seq    SEQUENCE     �   CREATE SEQUENCE public.enroll_detail_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.enroll_detail_id_seq;
       public          postgres    false    224            �           0    0    enroll_detail_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.enroll_detail_id_seq OWNED BY public.enroll_detail.id;
          public          postgres    false    223            �            1259    17830    enroll_id_seq    SEQUENCE     �   CREATE SEQUENCE public.enroll_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 $   DROP SEQUENCE public.enroll_id_seq;
       public          postgres    false    222            �           0    0    enroll_id_seq    SEQUENCE OWNED BY     ?   ALTER SEQUENCE public.enroll_id_seq OWNED BY public.enroll.id;
          public          postgres    false    221            �            1259    17824    m_course    TABLE     u   CREATE TABLE public.m_course (
    id integer NOT NULL,
    course_name character varying(50),
    credit integer
);
    DROP TABLE public.m_course;
       public         heap    postgres    false            �            1259    17823    m_course_id_seq    SEQUENCE     �   CREATE SEQUENCE public.m_course_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.m_course_id_seq;
       public          postgres    false    220            �           0    0    m_course_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.m_course_id_seq OWNED BY public.m_course.id;
          public          postgres    false    219            �            1259    17810    m_period    TABLE     a   CREATE TABLE public.m_period (
    id integer NOT NULL,
    period_name character varying(15)
);
    DROP TABLE public.m_period;
       public         heap    postgres    false            �            1259    17809    m_period_id_seq    SEQUENCE     �   CREATE SEQUENCE public.m_period_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.m_period_id_seq;
       public          postgres    false    216            �           0    0    m_period_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.m_period_id_seq OWNED BY public.m_period.id;
          public          postgres    false    215            �            1259    17817 	   m_student    TABLE     �   CREATE TABLE public.m_student (
    id integer NOT NULL,
    student_name character varying(50),
    major character varying(50)
);
    DROP TABLE public.m_student;
       public         heap    postgres    false            �            1259    17816    m_student_id_seq    SEQUENCE     �   CREATE SEQUENCE public.m_student_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.m_student_id_seq;
       public          postgres    false    218            �           0    0    m_student_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.m_student_id_seq OWNED BY public.m_student.id;
          public          postgres    false    217            1           2604    17834 	   enroll id    DEFAULT     f   ALTER TABLE ONLY public.enroll ALTER COLUMN id SET DEFAULT nextval('public.enroll_id_seq'::regclass);
 8   ALTER TABLE public.enroll ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    221    222    222            2           2604    17846    enroll_detail id    DEFAULT     t   ALTER TABLE ONLY public.enroll_detail ALTER COLUMN id SET DEFAULT nextval('public.enroll_detail_id_seq'::regclass);
 ?   ALTER TABLE public.enroll_detail ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    224    223    224            0           2604    17827    m_course id    DEFAULT     j   ALTER TABLE ONLY public.m_course ALTER COLUMN id SET DEFAULT nextval('public.m_course_id_seq'::regclass);
 :   ALTER TABLE public.m_course ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    220    219    220            .           2604    17813    m_period id    DEFAULT     j   ALTER TABLE ONLY public.m_period ALTER COLUMN id SET DEFAULT nextval('public.m_period_id_seq'::regclass);
 :   ALTER TABLE public.m_period ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    215    216    216            /           2604    17820    m_student id    DEFAULT     l   ALTER TABLE ONLY public.m_student ALTER COLUMN id SET DEFAULT nextval('public.m_student_id_seq'::regclass);
 ;   ALTER TABLE public.m_student ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    218    217    218            �          0    17831    enroll 
   TABLE DATA           0   COPY public.enroll (id, student_id) FROM stdin;
    public          postgres    false    222   &.       �          0    17843    enroll_detail 
   TABLE DATA           L   COPY public.enroll_detail (id, enroll_id, course_id, period_id) FROM stdin;
    public          postgres    false    224   C.       �          0    17824    m_course 
   TABLE DATA           ;   COPY public.m_course (id, course_name, credit) FROM stdin;
    public          postgres    false    220   `.       �          0    17810    m_period 
   TABLE DATA           3   COPY public.m_period (id, period_name) FROM stdin;
    public          postgres    false    216   �.       �          0    17817 	   m_student 
   TABLE DATA           <   COPY public.m_student (id, student_name, major) FROM stdin;
    public          postgres    false    218   �.       �           0    0    enroll_detail_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.enroll_detail_id_seq', 15, true);
          public          postgres    false    223            �           0    0    enroll_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.enroll_id_seq', 3, true);
          public          postgres    false    221            �           0    0    m_course_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.m_course_id_seq', 1, false);
          public          postgres    false    219            �           0    0    m_period_id_seq    SEQUENCE SET     >   SELECT pg_catalog.setval('public.m_period_id_seq', 1, false);
          public          postgres    false    215            �           0    0    m_student_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.m_student_id_seq', 1, false);
          public          postgres    false    217            <           2606    17848     enroll_detail enroll_detail_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.enroll_detail
    ADD CONSTRAINT enroll_detail_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.enroll_detail DROP CONSTRAINT enroll_detail_pkey;
       public            postgres    false    224            :           2606    17836    enroll enroll_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.enroll
    ADD CONSTRAINT enroll_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.enroll DROP CONSTRAINT enroll_pkey;
       public            postgres    false    222            8           2606    17829    m_course m_course_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.m_course
    ADD CONSTRAINT m_course_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.m_course DROP CONSTRAINT m_course_pkey;
       public            postgres    false    220            4           2606    17815    m_period m_period_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.m_period
    ADD CONSTRAINT m_period_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.m_period DROP CONSTRAINT m_period_pkey;
       public            postgres    false    216            6           2606    17822    m_student m_student_pkey 
   CONSTRAINT     V   ALTER TABLE ONLY public.m_student
    ADD CONSTRAINT m_student_pkey PRIMARY KEY (id);
 B   ALTER TABLE ONLY public.m_student DROP CONSTRAINT m_student_pkey;
       public            postgres    false    218            >           2606    17854 *   enroll_detail enroll_detail_course_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.enroll_detail
    ADD CONSTRAINT enroll_detail_course_id_fkey FOREIGN KEY (course_id) REFERENCES public.m_course(id);
 T   ALTER TABLE ONLY public.enroll_detail DROP CONSTRAINT enroll_detail_course_id_fkey;
       public          postgres    false    224    220    4664            ?           2606    17849 *   enroll_detail enroll_detail_enroll_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.enroll_detail
    ADD CONSTRAINT enroll_detail_enroll_id_fkey FOREIGN KEY (enroll_id) REFERENCES public.enroll(id);
 T   ALTER TABLE ONLY public.enroll_detail DROP CONSTRAINT enroll_detail_enroll_id_fkey;
       public          postgres    false    222    4666    224            @           2606    17859 *   enroll_detail enroll_detail_period_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.enroll_detail
    ADD CONSTRAINT enroll_detail_period_id_fkey FOREIGN KEY (period_id) REFERENCES public.m_period(id);
 T   ALTER TABLE ONLY public.enroll_detail DROP CONSTRAINT enroll_detail_period_id_fkey;
       public          postgres    false    224    4660    216            =           2606    17837    enroll enroll_student_id_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.enroll
    ADD CONSTRAINT enroll_student_id_fkey FOREIGN KEY (student_id) REFERENCES public.m_student(id);
 G   ALTER TABLE ONLY public.enroll DROP CONSTRAINT enroll_student_id_fkey;
       public          postgres    false    222    218    4662            �      x������ � �      �      x������ � �      �   C   x�3�t��JLJ,�4�2��N��.�)-V��4�2�.I,�,�,��V��BE�@�H@�1z\\\ �*�      �   2   x�3�4202�uO�K,�2�r�2s���<CK�TL�!���c���� �m�      �   !   x�3�M���N,.)JT�M-������� c     